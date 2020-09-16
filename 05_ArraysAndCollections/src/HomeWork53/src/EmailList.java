import java.util.TreeSet;

public class EmailList {

    TreeSet<String> emailList = new TreeSet<>();

    public String add(String) {
        return emailList.add();
    }
    public String printList(String){
        return String.valueOf(emailList.size());
    }
}