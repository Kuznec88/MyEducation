
import java.time.LocalDateTime;

public class DepositAcc extends BankAccount { // может использоваться в классе main

    private LocalDateTime month; // только в рамках класса

    @Override
    public void putMoney(int addMoney) { //используется в рамках пакета
        setMoney(money + addMoney);
        month = LocalDateTime.now().plusMonths(1);
        System.out.println("Депозитный счет пополнен " + getBalance() + " снять деньги можно будет после: " + month + "\n");
    }

    @Override
    public void inPutMoney(int removeMoney) { // используется в рамках пакета
        if (LocalDateTime.now().equals(month)) {
            super.inPutMoney(removeMoney);
        } else {
            System.out.println("Прошло мало времени, приходите после: " + month + "\n");
        }
    }
}