import java.util.ArrayList;
import java.util.Scanner;

public class ModulFive {
    public static void main(String[] args) {

        ArrayList<String> todoList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду: ");
        String instruction = scanner.nextLine();
        String information = scanner.nextLine();
        String element = scanner.nextLine();

// todoList.add("Привет");
// todoList.add("Как дела");
//todoList.remove(0);

        if (instruction.matches("list"))
        {
            todoList.size();
            System.out.println("Список дел: " + todoList.toString()); // сделать чтоб вводилось кореектно
            scanner.next();
        }

        if (instruction.matches("add"))
        {
            todoList.add(information);
        }
        if (instruction.matches("delete")&& todoList.size() > 0)
        {
            for(int lastIndex = 0; lastIndex < todoList.size(); lastIndex++)
                todoList.remove(lastIndex);
            scanner.next();
        }
        if(instruction.matches("edit"))
        {
            todoList.set(todoList.indexOf(information),element);
            scanner.next();
        }
    }
}
//        String[][] misterIks = {
//                {"X", " ", " ", " ", " ", " ", "X"},
//                {" ", "X", " ", " ", " ", "X", " "},
//                {" ", " ", "X", " ", "X", " ", " "},
//                {" ", " ", " ", "X", " ", " ", " "},
//                {" ", " ", "X", " ", "X", " ", " "},
//                {" ", "X", " ", " ", " ", "X", " "},
//                {"X", " ", " ", " ", " ", " ", "X"},
//
//        };
//        for (int i = 0; i < misterIks.length; i++) { //идём по строкам
//            for (int j = 0; j < misterIks[i].length; j++) {//идём по столбцам
//                System.out.print(" " + misterIks[i][j] + " "); //вывод элемента
//            }
//            System.out.println();//перенос строки ради визуального сохранения табличной формы
//        }
