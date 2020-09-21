import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in); // создаем сканнер

    public static String[] getLine() // создаем метод для получения строк
    {
        System.out.println("Введите команду \"ADD\" или \"LIST\" ");
        String[] scannerString = scanner.nextLine().split("\\s+", 2); // делим строку полученыю в сканнере по пробелам
        return scannerString; //возвращаем массив
    }
}