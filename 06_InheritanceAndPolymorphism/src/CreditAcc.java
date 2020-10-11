import java.time.LocalDateTime;

public class CreditAcc extends BankAccount{

    public static LocalDateTime now = LocalDateTime.now();
    public static LocalDateTime month = now.plusMonths(1);
    public static boolean after = now.isAfter(month);

    public void Credit(int money)
    {
        super.money = money;
    }

    @Override
    public void putMoney(int addMoney) {
        super.putMoney(addMoney);
        System.out.println("кредитные бабки " + getBalance() + " " + now);
    }

    @Override
    public void inPutMoney(int removeMoney) {
        if(after) {
            super.inPutMoney(removeMoney);
        }else{
            System.out.println("Прошло мало времени, приходите: " + month);
        }
    }
}
