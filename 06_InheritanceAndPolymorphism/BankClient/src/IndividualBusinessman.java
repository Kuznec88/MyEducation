public class IndividualBusinessman extends Client{

    @Override
    public double getBalance() {
        return super.money;
    }

    @Override
    public void setMoney(double money) {
        super.money = money;
    }

    @Override
    public void putMoney(double addMoney)
    {
        if (addMoney > 0 && addMoney < 1000)
        {
            double v = (addMoney - ((addMoney) * PERCENT1));
            setMoney(super.money + v);

            System.out.println("Пополнение ИП на " + v);
        }

        if(addMoney >= 1000)
        {
            double b = (addMoney - ((addMoney) * HALFPERCENT));
            setMoney(super.money + b);

            System.out.println("Пополнение ИП на " + b);
        }
    }

    @Override
    public void inPutMoney(double removeMoney)
    {
        if (getBalance() > 0 && removeMoney <= getBalance())
        { // если на балансе сумма больше нуля, и в поле цифра меньшая или равна деньгам на счете
            setMoney(money - removeMoney); // перезаписываем значение через сеттер с минусом суммы из поля
        }
        System.out.println("Снятие с ИП " + removeMoney); // вывод
    }
}