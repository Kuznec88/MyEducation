public class LegalPerson extends Client {

    @Override
    public double getBalance() {
        return super.money;
    }

    @Override
    public void setMoney(double money) {
        super.money = money;
    }

    @Override
    public void putMoney(double addMoney) {
        {
            if (addMoney > 0) // если в поле сумма больше чем ноль
            {
                setMoney(money + addMoney); // плюсуем к переменной класса цифру из поля, сеттер перезаписывает значения с + суммой
            }
            System.out.println("Юр.лицо пополнен " + getBalance()); // вывод
        }
    }

    @Override
    public void inPutMoney(double removeMoney) {
        double d = (removeMoney + ((removeMoney) * PERCENT1));
        if (removeMoney > 0 && removeMoney > d) {
            setMoney(super.money - d);
            System.out.println("Юр.лицо сняты " + d);
        }else{
            System.out.println("Снять с юр.лица невозможно");
        }
    }
}