public class BankAccount{

    public int money;

    public void bankAcc(int money)
    {
        this.money = money;
    }
    public int getMoney()
    {
        return money;
    }
    public void setMoney(int money)
    {
        this.money = money;
    }
    public int getBalance()
    {
        return getMoney();
    }
    public void putMoney(int addMoney)
    {
        bankAcc(money + addMoney);
    }
    public void inPutMoney(int removeMoney)
    {
        bankAcc(money - removeMoney);
    }
}
