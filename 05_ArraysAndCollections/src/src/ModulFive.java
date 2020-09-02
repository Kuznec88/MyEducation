import java.util.ArrayList;
import java.util.Scanner;

public class ModulFive {
    public static void main(String[] args) {

        ArrayList<String> todoList = new ArrayList<>(); // создаем аррайлист хранящий строки

        Scanner scanner = new Scanner(System.in); // создаем сканнер чтоб считывать ввод строк
        System.out.println("Введите команду: "); // выводим что будет передсканнером

        while (true) { // бесконечный цикл

            String instruction = scanner.nextLine();// строка введенная в сканнер называется инструкция

            if (instruction.matches("list")) { // если введенная строка соответсвтует list
                for(String sizeList : todoList) // задаем еще одну переменную для корректного вывода
                    System.out.println("Список дел: " + sizeList); // выводим
            }
                if (instruction.matches("add\\s+\\d+\\s+.+")) { // если инструкция соответствует add, пробел..., целое число..., пробел..., любой символ...
                    String[] added = instruction.split("\\s+", 3); // создаем масиив строк и разбиваем инстуркцию по 3 пробелам
                    todoList.add(Integer.parseInt(added[1]), added[2]); // в аррайлист добавляем преобразованный в целое число номер дела и само дело?
                    System.out.println("Добавлено дело " + todoList.size());
                }

                if (instruction.matches("delete\\s+\\d+") && todoList.size() > 0) { // если инструкция соотвествует delete с пробелом и любая цифра
                    String[] deleted = instruction.split("\\s+",2); // создается массив строк и делится по 2 пробелам
                    todoList.remove(Integer.parseInt(deleted[1])); // удаляем элемент преобразованный в инт в массиве под индексом 1
                    System.out.println("Дело удалено"); // вывод
                }
                if (instruction.matches("edit\\s+\\d+\\s+.+") && todoList.size() > 0) {
                    String[] edited = instruction.split("\\s+", 3);
                    todoList.set(Integer.parseInt(edited[1]), edited[2]);
                    System.out.println("Дело изменено");
                }
                if(todoList.isEmpty())// если аррайлист пуст
                {
                System.out.println("Список пуст");// выводим инфу
                }
        }
    }
}