import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду balance, put или take");
        String information = scanner.nextLine();


        for (; ; ) {
            if (information.startsWith("balance")) {
                System.out.println("На счету: " + bankAccount.getBalance() + " рублей");
            }
            if(information.startsWith("put"))
            {

            }
        }
    }
}