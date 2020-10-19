public class CreditAcc extends BankAccount
    {

    private static final double PERCENT = 1/100;

    public void Credit(int money)
    {
        super.money = money;
    }

    @Override
    public void inPutMoney(int removeMoney)
    {
        if(removeMoney > 0 && removeMoney <= super.money)
        {
            Credit((int) (super.money - (removeMoney + ((removeMoney) * PERCENT))));
            System.out.println("Депозитные бабки " + getBalance());
        }
    }
}