import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in);

    static String line = scanner.nextLine();

    public void setLine()
    {
        this.line = line;
    }
    public static String getLine()
    {
        return line;
    }
} 