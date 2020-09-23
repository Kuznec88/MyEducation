import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> phoneBook = new TreeMap<>(); // допустим создаем мапу
        System.out.println("Введите номер телефона, имя или команду LIST: "); // первая строчка просит ввести что нибудь
        Scanner scanner = new Scanner(System.in); // создаем сканнер

//phoneBook.put("stas",898989); // это мои проверочные штуки)

        for (; ; ) { // создаем цикл

            String information = scanner.nextLine(); // делим первую строчку по цифрам

            if (information.startsWith("LIST") && !phoneBook.isEmpty()) {
                for (String vivod : phoneBook.keySet())
                    System.out.println("Абонент " + vivod + " с номером " + phoneBook.get(vivod));
            }else {
                System.out.println("Телефонная книга пуста");
            }
            if(information.matches("\\d+") && !phoneBook.containsValue(Integer.parseInt(information))){
                System.out.println("Такого номера нет в контактах, введите для него имя: ");
                phoneBook.put(scanner.nextLine(), (Integer.parseInt(information)));
                System.out.println("В контакты добавлен абонент: " + phoneBook.keySet() + "с номером " + phoneBook.values());
            }
            if(information.matches("\\D+") && !phoneBook.containsKey(information))
            {
                System.out.println("Такого имени нет в контактах, введите для него номер: ");
                phoneBook.put(information,Integer.parseInt(scanner.nextLine()));
                System.out.println("В контакты добавлен абонент: " + phoneBook.keySet() + "с номером " + phoneBook.values());
            }
            if(information.matches(phoneBook.keySet().toString()))
            {
                System.out.println("Абонент " + phoneBook.keySet() + " с номером " + phoneBook.values());
            }
        }
    }
}