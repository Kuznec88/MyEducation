import java.util.TreeSet;

public class EmailList {

    TreeSet<String> emailList = new TreeSet<>(); // конструктор для трисета?

    public void add(String email) { // метод add строковый
        emailList.add(email); // команда для добавления в трисет
    }
    public void printList() // метод для вывода в консоль
    {
        for(String sizeList : emailList)
            System.out.println("Список мыл: " + sizeList);
    }
}