public class BankAccount {// может использоваться в классе main

    public int money; //используется в рамках пакета

    protected void setMoney(int money) // используется в рамках пакета
    {
        this.money = money; // для денег в переменной ключевое слово this
    }

    public int getBalance() // используется в рамках пакета
    {
        return money;//переменная класса
    }

    public void putMoney(int addMoney) // используется в рамках пакета
    {
        if (addMoney > 0) // если в поле сумма больше чем ноль
        {
            setMoney(money + addMoney); // плюсуем к переменной класса цифру из поля, сеттер перезаписывает значения с + суммой
        }
        System.out.println("Баланс успешно пополнен"); // вывод
    }

    public void inPutMoney(int removeMoney) // используется в рамках пакета
    {
            if (getBalance() > 0 && removeMoney <= getBalance())
            { // если на балансе сумма больше нуля, и в поле цифра меньшая или равна деньгам на счете
                setMoney(money - removeMoney); // перезаписываем значение через сеттер с минусом суммы из поля
            }
        System.out.println("Деньги успешно сняты"); // вывод
    }
}