import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    private static final String FILE_NAME = "mskMetro.json"; // название файла для json
    private static final String URL = "https://www.moscowmap.ru/metro.html#lines"; // ссылкав константе для удобства

    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect(URL).get();  // получаем доступ к сайту
        Elements lines = doc.select("div.js-toggle-depend");
        // div универсальный блочный сегмент, в данном случае получаем блок с линиями
        Elements stationsByLines = doc.select("div.js-metro-stations");
        // здесь блок со станциями

        Map<String, List<String>> stationMap = new HashMap<>();
        // мапа в котрой ключ это название линии а значение список станций
        Map<String, String> lineMap = new HashMap<>();
        List<Connection> connections = new ArrayList<>();
        // здесь хранятся переходы в виде объектов


        for (int i = 0; i < lines.size(); i++) {
            // цикл чтоб пробегаться по блокам и записывать значения в мапы
            Element line = lines.get(i).selectFirst("span.js-metro-line");
            // получает значения названий станций, атрибут span нужен чтобы группировать значения
            Elements stations = stationsByLines.get(i).select("p");
            // далее получаем список станций по атрибуту р, р это получение абзаца
            String lineNum = line.attr("data-line");
            // data универсальный атрибут для создания стилей и вспылвающих окон
            // в данном случаем с помощью него мы получаем данные линии то есть номер
            stationMap.put(lineNum, stations
                    .stream()
                    .map(e -> e.select("span.name").text())
                    .collect(Collectors.toList()));
            /**
            с помощью функционального программирования создаем поток
             который будет укладывать в мапу номер станции в качестве ключа
             далее так же как выше полуаем имя элемента и переводим его в текст
             который кладется в виде List в мапу
             получается в stationMap лежит номер станции(K) и лист с названиями станций (V)
             */
               lineMap.put(lineNum, line.text());
//             в мапу с линиями кладем номер линии и название

            stations.forEach(el -> connections.add(new Connection(
                    lineNum,
                    el.select("span.name").text(),
                    el.select("span.t-icon-metroln")
                            .stream()
                            .map(e -> new Connection(
                                    e.attr("class")
                                            .replaceAll(".+ln-", ""),
                                    e.attr("title")
                                            .replaceAll(".+«(.+)».+", "$1")))
                            .collect(Collectors.toList()))));
            /**
            Теперь необходимо добавить переходы станции метро
             в виде объектов, для этого создается переберающий поток forEach
             и в лист connection добавляются созданные объекты
             далее выбирается элемент и вытаскивается название станции
             если у станции в теге есть еще станции они добавляются в лист
             и считаются пересадкой
             */
        }

        Map<String, Object> map = new HashMap<>();
        map.put("stations", stationMap);
        map.put("lines", lineMap);
        map.put("connections", connections);

        // Этам мапа нужна для корректной записи в формат json

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new FileOutputStream(FILE_NAME), map);

        System.out.println("Всего станций для пересадки в Московском метрополитене - " + connections.size());
        }
    }