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
        if(addMoney > 0)
            bankAcc(money + addMoney);
        System.out.println("Баланс успешно пополнен");
    }
    public void inPutMoney(int removeMoney)
    {
        if(getMoney() > 0 && removeMoney <= getMoney())
            bankAcc(money - removeMoney);
        System.out.println("Деньги успешно сняты");
    }
}