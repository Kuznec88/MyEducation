public class LegalPerson extends Client {

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
    public void inPutMoney(double removeMoney)
    {
        double d = (removeMoney + ((removeMoney) * getPERCENT1()));

        if (removeMoney > 0 && removeMoney < d) {
            setMoney(super.getBalance() - d);
            System.out.println("Юр.лицо сняты " + d + "\n");
        }else{
            System.out.println("Снять с юр.лица невозможно" + "\n");
        }
    }

    @Override
    public String getInfo()
    {
        return "Пополнение без комиссии, снятие с комиссией 1%" + "\n";
    }
}