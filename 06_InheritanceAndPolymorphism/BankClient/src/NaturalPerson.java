public class NaturalPerson extends Client {

    @Override
    public double getBalance()
    {
        return super.money;
    }

    @Override
    public void setMoney(double money) {
        super.money = money;
    }

    @Override
    public void putMoney(double addMoney)
    {
        if (addMoney > 0) // если в поле сумма больше чем ноль
        {
            setMoney(money + addMoney); // плюсуем к переменной класса цифру из поля, сеттер перезаписывает значения с + суммой
        }
        System.out.println("Физ. лицо пополнен счет " + getBalance()); // вывод
    }

    @Override
    public void inPutMoney(double removeMoney)
    {
        if (getBalance() > 0 && removeMoney <= getBalance())
        { // если на балансе сумма больше нуля, и в поле цифра меньшая или равна деньгам на счете
            setMoney(money - removeMoney); // перезаписываем значение через сеттер с минусом суммы из поля
        }
        System.out.println("Физ. лицо сняты деньги " + removeMoney); // вывод
    }
}
