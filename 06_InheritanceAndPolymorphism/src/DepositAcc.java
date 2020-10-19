import java.time.LocalDateTime;

public class DepositAcc extends BankAccount {

    LocalDateTime month = LocalDateTime.now().plusMonths(1);

    public void Credit(int money) {
        super.money = money;
    }

    @Override
    public void putMoney(int addMoney) {
        super.putMoney(addMoney);
        System.out.println("Кредитный счет пополнен " + getBalance() + " снять деньги можно будет: " + month + "\n");
    }

    @Override
    public void inPutMoney(int removeMoney) {
        if (!LocalDateTime.now().equals(month)) {
            System.out.println("Cнять деньги можно будет: " + month + "\n");
        } else {
            super.inPutMoney(removeMoney);
        }
    }
}