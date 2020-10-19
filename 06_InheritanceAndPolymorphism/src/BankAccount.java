public class BankAccount
    {

    public int money;

    public void setMoney(int money)
    {
        this.money = money;
    }
    public int getBalance()
    {
        return money;
    }
    public void putMoney(int addMoney)
    {
        if (addMoney > 0)
            setMoney(money + addMoney);
        System.out.println("Баланс успешно пополнен");
    }
    public void inPutMoney(int removeMoney)
    {
        if(getBalance() > 0 && removeMoney <= getBalance())
            setMoney(money - removeMoney);
        System.out.println("Деньги успешно сняты");
    }

}