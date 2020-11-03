public class NaturalPerson extends Client {

    @Override
    public double getBalance()
    {
        return super.getBalance();
    }

    @Override
    public void setMoney(double money)
    {
        super.setMoney(money);
    }

    @Override
    public String getInfo()
    {
        return "Пополнение и снятие без комиссии" + "\n";
    }
}