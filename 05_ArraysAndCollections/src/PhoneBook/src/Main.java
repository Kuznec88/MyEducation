import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> phoneBook = new HashMap<>(); // допустим создаем мапу
        System.out.println("Введите номер телефона: "); // первая строчка просит ввести что нибудь
        Scanner scanner = new Scanner(System.in); // создаем сканнер
        String[] number = scanner.nextLine().split("\\d+"); // делим первую строчку по цифрам
        String[] name = scanner.nextLine().split("\\w+"); // вторую по буквам


        phoneBook.put(3495834, "stas"); // это мои проверочные штуки)
        System.out.println("Размер массив с номером " + number.length);
        System.out.println("Размер массив с именем " + name.length);
        System.out.println(phoneBook.toString());

        while (true) { // создаем цикл
            if (phoneBook.containsKey(Integer.parseInt(number[1]))) { // если в мапе есть ключ с номером который переведенн в стринг
                System.out.println("Введите имя: "); // то просим ввести имя
                phoneBook.put(Integer.parseInt(number[0]), name[1]); // добавить в мапу ключ с номером и значение с именем

                if (phoneBook.containsValue(name[1])) { // если в мапе есть значение с именем
                    System.out.println("Введите номер: "); // то просим ввести номер
                    phoneBook.put(Integer.parseInt(number[0]), name[1]); // добавляем в мап ключ и значение
                }
            }
        }
    }
}