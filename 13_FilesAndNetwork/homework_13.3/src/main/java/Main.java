import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static final String PATH_TO_LIST = "src/test/resources/movementList.csv";
    public static void main(String[] args) throws IOException {

        Movements movements = new Movements(PATH_TO_LIST);

        List<String> lines = Files.readAllLines(Paths.get(PATH_TO_LIST));
        for (int i = 1; i < lines.size(); i++) {
            movements.getIncomeSum(lines.get(i));
        }

        movements.printData();
    }
}