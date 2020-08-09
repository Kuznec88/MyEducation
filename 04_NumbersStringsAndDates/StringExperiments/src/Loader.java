import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Loader {
    public static void main(String[] args) {

//        int day = 17;
//        int month = 11;
//        int year = 1992;

        DateFormat dateFormat = new SimpleDateFormat("- dd.MM.yyyy - EEE", Locale.ENGLISH); //Задаем оформление даты
        Calendar calendar = Calendar.getInstance(); // создаем календарь
        calendar.set(1992, Calendar.NOVEMBER, 17);  // Задаем наш день рождения
        Date date = new Date();
        Date your = calendar.getTime();
        int i = 0;
        while (date.compareTo(your) > 0)            // сравниваем дату рождения + количество лет с текущей датой если дата дня рождения раньше текущей даты получаем 1
        {
            System.out.println(i + dateFormat.format(your));        // выводим данные типо  0- 17.11.1992 , где 0 это количество лет
            calendar.add(Calendar.YEAR, 1);    // Добавляем к дню рождения +1 год
            your = calendar.getTime();
            i++;

        }





        String bbcNews = "Australia's virus-hit state of Victoria has reported its worst death toll and case rise, prompting fears that a six-week lockdown of state capital Melbourne is not working.\n" +
                "\n" +
                "The state confirmed 13 new deaths and 723 new cases on Thursday - a 36% jump on the case record set on Monday.\n" +
                "\n" +
                "There are fears now that Melbourne's lockdown, which began on 7 July, will need to be extended.\n" +
                "\n" +
                "The spike meant Australia overall had its deadliest day in the pandemic.\n" +
                "\n" +
                "A 14th person died late on Thursday but his death will be included in Friday's figures as it was announced after the government's briefing.\n" +
                "\n" +
                "Officials in Victoria renewed appeals for people with symptoms to get tested quickly.\n" +
                "\n" +
                "Last week, the Victorian government said sick people breaking isolation rules - or not getting tested in time - was leading to continued spread despite lockdown measures.\n" +
                "\n" +
                "\"If you've got symptoms, the only thing you can do is get tested,\" said Premier Daniel Andrews.\n" +
                "\n" +
                "\"You just can't go to work. Because all you'll be doing is spreading the virus.\"\n" +
                "\n" +
                "Thursday's figures dash hopes that recent lower case numbers indicated the state had turned a corner.";


        bbcNews = bbcNews.replaceAll("\\p{Punct}", "");
        String[] space = bbcNews.split("\\s+"); // задание с текстом и регулярными выражениями


//        for (int i = 0; i < space.length; i++) {
//
//            System.out.println(space[i]);
//            System.out.println(" количество слов " + space.length);
//        }

        String safe = " <1234567891011>1213"; // задание со звездочкой

        int n = safe.indexOf('<');
        int k = safe.indexOf('>');

        System.out.println(safe.substring(0, n) + "**************" + safe.substring(k + 1));


        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

//        String [] digits = text.split("\\D+"); // здесь застрял, непонимаю как привести весь массив строк к инту, то есть по конкректным элементам массива получается...
//        int calc = Integer.parseInt(digits[]); // ... а все вместе нет
//        for(int i = 0; i < calc; i++)
//        {
//            System.out.println(i);
//        }


        //int first = Integer.parseInt(digits[1]); // единственное непонял, почему у меня массив начинается с 1 а не с 0?
//        int second = Integer.parseInt (digits[2]); // это как то связано с методом сплит?
//        int third = Integer.parseInt (digits[3]);


//        int sizeOfStr = text.length(); // переменная длина строки
//        int sum = 0; // инициализируем переменную sum с дефолтным значением
//        int tempNum = 0; // здесь инициализируем переменную которая вернет нам конкректную цифру из String
//
//        for (int i = 0; i < sizeOfStr; ++i) { // цикл для перебора char
//            if (Character.isDigit(text.charAt(i))) { // если char который передает нам цикл - цифра, то...
//                tempNum = (10 * tempNum) + Character.getNumericValue(text.charAt(i)); // в переменной считаем значение цифры из текста и умножаем на 10 чтобы получилось целое число?
//            } else // в другом случае...
//            {
//                sum += tempNum; // суммирует полученные числа
//                tempNum = 0; // обнуляем переменную чтобы цикл отработал заново
//            }
//        }
//        sum += tempNum; // получаем переменную с суммой всех полученных чисел
//        System.out.println("Ребята заработали суммарно " + sum); // выводим в консоль


        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char c : alphabet.toCharArray()) {
            System.out.println("Для буквы " + c + " " + "соотвестствует код " + (int) c);
        }

        Scanner scanner = new Scanner(System.in); // создаем сканнер
        System.out.println("Введите ФИО: "); // просим ввести ФИО
        String fullName = scanner.nextLine(); // считываем следующую строку

        String[] anyName = fullName.split("\\s+"); // измененное задание, вытащил все из одного массива

        System.out.println("Фамилия: " + anyName[0]); // выводим в консоль
        System.out.println("Имя: " + anyName[1]);
        System.out.println("Отчество: " + anyName[2]);

        if (!(anyName.length == 2)) {
            System.out.println("Введите отчество");
        }




        Scanner scanner2 = new Scanner(System.in); // начал писать метод для номеров телефона

        System.out.println("Введите номер телефона: ");

        String telNumber = scanner2.nextLine();

        System.out.println(telNumber.replaceAll("[^0-9]", ""));

        System.out.println(telNumber.length());

        if(telNumber.length() > 11)
        {
            System.out.println("Цифр больше чем надо");
        }
        if(telNumber.length() < 11)
        {
            System.out.println("Цифр меньше чем надо");
        }
        if (telNumber.indexOf(1) != 7 && telNumber.indexOf(1) != 8)
        {
            System.out.println("Неправильный код страны");

            System.out.println("Код страны измененнен ");
        }
        }
    }
