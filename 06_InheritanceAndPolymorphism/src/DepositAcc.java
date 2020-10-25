
import java.time.LocalDateTime;

public class DepositAcc extends BankAccount {

    private LocalDateTime month;

    @Override
    public void putMoney(int addMoney) {
        setMoney(money + addMoney);
        month = LocalDateTime.now().plusMonths(1);
        System.out.println("Депозитный счет пополнен " + getBalance() + " снять деньги можно будет после: " + month + "\n");
    }

    @Override
    public void inPutMoney(int removeMoney) {
        if (LocalDateTime.now().equals(month)) {
            super.inPutMoney(removeMoney);
        } else {
            System.out.println("Прошло мало времени, приходите после: " + month + "\n");
        }
    }
}