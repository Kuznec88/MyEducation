import java.util.HashMap;

public class CustomerStorage
{
    private HashMap<String, Customer> storage;

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws Exception
    {
        String[] components = data.split("\\s+");
        String name = components[0] + " " + components[1];
        storage.put(name, new Customer(name, components[3], components[2]));

        if (!components[2].contains("@"))
        {
            System.out.println("Email введен неверно"); // здесь еще проверки на корректность ввода
        }
        if (!components[3].startsWith("+7"))
        {
            System.out.println("Номер введен неправильно");
        }

    }

    public void listCustomers() {
        if (storage.size() == 0) {
            System.out.println("Список пуст, сначала добавьте пользователя (list)"); // добавил проверку на наличия пользователя ы списке
        } else {
            storage.values().forEach(System.out::println);
        }
    }

    public void removeCustomer(String name) throws Exception {
        if (storage.size() == 0) {
            System.out.println("Список пуст, сначала добавьте пользователя (remove)");
            // здесь тоже проверка на наличие в списке, remove & list показывает откуда приходит сообщение
        } else {
            storage.remove(name);
        }
    }

    public int getCount()
    {
        return storage.size();
    }
}