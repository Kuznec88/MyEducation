public abstract class Client
{
    private static final double PERCENT1 = 1.0 / 100;

    private static final double HALFPERCENT = 0.5/100;

    private double money;

    public double getBalance()
    {
        return money;
    }
    public void setMoney(double money)
    {
        this.money = money;
    }
    public void putMoney(double addMoney)
    {
        if (addMoney > 0)
        {
            setMoney(getBalance() + addMoney);
        }
        System.out.println("Счет пополнен на: " + getBalance() + "\n" );
    }
    public void inPutMoney(double removeMoney)
    {
        if (getBalance() > 0 && removeMoney <= getBalance())
        {
            setMoney(getBalance() - removeMoney);
        }
        System.out.println("Сняты деньги: " + removeMoney + "\n"); // вывод
    }
    public static double getHALFPERCENT()
    {
        return HALFPERCENT;
    }

    public static double getPERCENT1()
    {
        return PERCENT1;
    }

    public abstract String getInfo();

}