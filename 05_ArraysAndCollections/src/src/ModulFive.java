import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ModulFive {
    public static void main(String[] args) {

        ArrayList<String> todoList = new ArrayList<>(); // создаем аррайлист хранящий строки

        Scanner scanner = new Scanner(System.in); // создаем сканнер чтоб считывать ввод строк
        System.out.println("Введите команду: "); // выводим что будет передсканнером

        while (true) {
            String instruction = scanner.nextLine();

            if (instruction.matches("list")) {
                for (String sizeList : todoList) {
                    System.out.println("Список дел: " + sizeList);
                }
                if (todoList.isEmpty()) {
                    System.out.println("Список пуст");
                }
            } else if (instruction.matches("add\\s+\\d+\\s+.+")) {
                String[] added = instruction.split("\\s+", 3);
                if (Integer.parseInt(added[1]) <= todoList.size()) {
                    todoList.add(Integer.parseInt(added[1]), added[2]);
                    System.out.println("Добавлено дело " + todoList.size());
                }
            } else if (instruction.matches("add\\s+.+")) {
                String[] secondAdd = instruction.split("\\s+", 2);
                todoList.add(secondAdd[1]);
                System.out.println("Добавлено дело " + todoList.size());
            } else if (instruction.matches("delete\\s+\\d+") && todoList.size() > 0) {
                String[] deleted = instruction.split("\\s+", 2);
                if (Integer.parseInt(deleted[1]) >= todoList.size()) {
                    System.out.println("Неправильный номер дела");
                } else {
                    todoList.remove(Integer.parseInt(deleted[1]));
                    System.out.println("Дело удалено");
                }
            } else if (instruction.matches("edit\\s+\\d+\\s+.+")) {
                String[] edited = instruction.split("\\s+", 3);
                if (Integer.parseInt(edited[1]) >= todoList.size()) {
                    System.out.println("Неправильный номер дела");
                } else {
                    todoList.set(Integer.parseInt(edited[1]), edited[2]);
                    System.out.println("Дело изменено");
                }
            }
        }
    }
}