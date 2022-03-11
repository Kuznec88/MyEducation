import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
// генерирует весь код который связан с POJO классами
@AllArgsConstructor
// аннотация генерирует конструктор для каждого поля в классе

public class Connection {

    private String lineNumber;
    private String stationName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    // проверка на null
    private List<Connection> connections;
    public static int connectionCount;

    public Connection(String lineNumber, String stationName) {
        this.lineNumber = lineNumber;
        this.stationName = stationName;
    }
}
