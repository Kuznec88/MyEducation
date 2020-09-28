import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Long, String> phoneBook = new TreeMap<>(); // допустим создаем мапу
        System.out.println("Введите номер телефона, имя или команду LIST: "); // первая строчка просит ввести что нибудь
        Scanner scanner = new Scanner(System.in); // создаем сканнер

        for (; ; ) { // создаем цикл

            String information = scanner.nextLine(); // делим первую строчку по цифрам

            if (information.startsWith("LIST")) {
                printMap(phoneBook);
                continue;
            }
            if(!phoneBook.isEmpty() && phoneBook.containsValue(information))
            {
                System.out.println("Номер " + phoneBook.keySet() + "для абонента " + phoneBook.values());
                continue;
            }
            if(!phoneBook.isEmpty() && phoneBook.containsKey(Long.parseLong(information)))
            {
                System.out.println("Номер " + phoneBook.keySet() + "для абонента " + phoneBook.values());
                continue;
            }
            if (information.matches("\\d+") && !phoneBook.containsKey(Long.parseLong(information))) {
                System.out.println("Такого номера нет в контактах, введите для него имя: ");
                phoneBook.put((Long.parseLong(information)), scanner.nextLine());
                System.out.println("В контакты добавлен номер: " + phoneBook.keySet() + "под именем " + phoneBook.values());
            }
            if (information.matches("\\D+") && !phoneBook.containsValue(information)) {
                System.out.println("Такого имени нет в контактах, введите для него номер: ");
                phoneBook.put(Long.parseLong(scanner.nextLine()), information);
                System.out.println("В контакты добавлен номер: " + phoneBook.keySet() + "под именем " + phoneBook.values());
            }
            if(phoneBook.isEmpty())
            {
                System.out.println("Телефонная книга пуста");
            }
        }
    }
    private static void printMap (Map<Long,String>map)
    {
        for(Long key : map.keySet())
        {
            System.out.println("Номер " + key + " принадлежит абоненту: " + map.get(key));
        }
    }
}