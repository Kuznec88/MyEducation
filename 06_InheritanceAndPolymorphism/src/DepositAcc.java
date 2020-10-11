public class DepositAcc extends BankAccount {

    private static final double PERCENT = 1;

    public void Deposit(int money)
    {
        super.money = money;
    }

    @Override
    public void inPutMoney(int removeMoney) {
        if(removeMoney > 0 && removeMoney <= money)
        {
            Deposit((int) (money - (removeMoney + ((removeMoney/100) * PERCENT))));
            System.out.println("Депозитные бабки " + getMoney());
        }
    }
}