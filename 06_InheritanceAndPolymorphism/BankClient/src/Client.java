public abstract class Client
{
    public static final double PERCENT1 = 1.0 / 100;

    public static final double HALFPERCENT = 0.5/100;

    public double money;

    public abstract double getBalance();

    public abstract void setMoney(double money);

    public abstract void putMoney(double addMoney);

    public abstract void inPutMoney(double removeMoney);
}