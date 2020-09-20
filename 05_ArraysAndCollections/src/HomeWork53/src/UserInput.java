import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in);

    public static String getLine()
    {
        System.out.println("Введите команду \"ADD\" или \"LIST\" ");
        String[] scannerString = scanner.nextLine().split("\\s+", 2);
        return String.valueOf(scannerString);
    }
}