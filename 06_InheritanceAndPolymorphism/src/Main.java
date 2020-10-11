import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount firstAcc = new BankAccount();
        BankAccount secAcc = new DepositAcc();
        BankAccount thirdAcc = new CreditAcc();

// System.out.println(secAcc.getBalance());
// secAcc.putMoney(500);
// secAcc.inPutMoney(100);
// thirdAcc.putMoney(200);
// thirdAcc.inPutMoney(100);

        for (; ; ) {
            System.out.println("Добавьте к команде цифру 1 для обычного аккаунта" + "\n" +
                    "Добавьте к команде цифру 2 для депозитного аккаунта" + "\n" +
                    "Добавьте цифру 3 для кредитного аккаунта " + "\n" +
                    "Введите команду: balance - чтобы узнать баланс счета" +
                    "\n" + "Введите команду: put - чтобы положить деньги на счет" +
                    "\n" + "Введите команду input - чтобы снять деньги со счета");

            Scanner scanner = new Scanner(System.in);
            String info = scanner.nextLine();

            if (info.startsWith("balance")) {
                System.out.println("баланс счета: " + firstAcc.getBalance() + " рублей" + "\n");
            }
            if (info.startsWith("put")) {
                firstAcc.putMoney(Integer.parseInt(scanner.nextLine()));
                System.out.println("Баланс успешно пополнен" + "\n" + "баланс счета: " + firstAcc.getBalance() + " рублей" + "\n");
            }
            if (info.startsWith("input") && firstAcc.getMoney() < Integer.parseInt(scanner.nextLine())) {
                System.out.println("Недостаточно средств для снятия" + "\n");
                continue;
            }
            if (info.startsWith("input")) {
                firstAcc.inPutMoney(Integer.parseInt(scanner.nextLine()));
                System.out.println("Деньги успешно сняты" + "\n" + "баланс счета: " + firstAcc.getBalance() + " рублей" + "\n");
            }
        }
    }
}