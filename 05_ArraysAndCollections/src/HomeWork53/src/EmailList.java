import java.util.TreeSet;

public class EmailList {

    TreeSet<String> emailList = new TreeSet<>();

    public String add(String email) {
        return String.valueOf(emailList.add(email));
    }
    public void printList()
    {
        for(String sizeList : emailList)
            System.out.println("Список мыл: " + sizeList);
    }
}