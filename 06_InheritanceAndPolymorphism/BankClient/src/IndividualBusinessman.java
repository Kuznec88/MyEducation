public class IndividualBusinessman extends Client{

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
    public void putMoney(double addMoney)
    {
        if (addMoney > 0 && addMoney < 1000)
        {
            double v = (addMoney - ((addMoney) * getPERCENT1()));
            setMoney(getBalance() + v);

            System.out.println("Пополнение ИП на " + v + "\n");
        }

        if(addMoney >= 1000)
        {
            double b = (addMoney - ((addMoney) * getHALFPERCENT()));
            setMoney(getBalance() + b);

            System.out.println("Пополнение ИП на " + b + "\n");
        }
    }

    @Override
    public String getInfo()
    {
        return "Пополнение до 1000р с комиссией 1%, от 1000р комиссия 0.5%, снятие без комиссии" + "\n";
    }
}