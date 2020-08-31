import java.util.ArrayList;
import java.util.Scanner;

public class ModulFive {
    public static void main(String[] args) {

        ArrayList<String[]> todoList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду: ");

        while (true) {
            String instruction = scanner.nextLine();

//             todoList.add("Привет");
//             todoList.add("Как дела");

            if (instruction.matches("list")) {
                todoList.size();
                for(String[] sizeList : todoList)
                    System.out.println("Список дел: " + sizeList);
            }

            if (instruction.matches("add")) {
                String[] cifra = instruction.split("\\d");

                for(int i = 0; i < cifra.length; i++)
                {
                    todoList.add(i, instruction.split("\\S"));
                    System.out.println("Добавлено дело " + todoList.size());
                }

            }
            if (instruction.matches("delete") && todoList.size() > 0) {

            }
            if(todoList.isEmpty())
            {
                System.out.println("Список пуст");
            }
//            if (instruction.matches("edit")) {
//                todoList.set(todoList.indexOf(information), element);
//                scanner.next();
//            }
        }
    }
}