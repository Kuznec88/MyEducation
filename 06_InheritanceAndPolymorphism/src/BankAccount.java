public class BankAccount {

    public int money; //объявили переменную

    public void setMoney(int money) // сеттер для денег, устанавливаем значения
    {
        this.money = money; // для денег в переменной ключевое слово this
    }

    public int getBalance() // запрашиваем баланс счета
    {
        return money;//переменная класса
    }

    public void putMoney(int addMoney) // добавляем денег на счет
    {
        if (addMoney > 0) // если в поле сумма больше чем ноль
        {
            setMoney(money + addMoney); // плюсуем к переменной класса цифру из поля, сеттер перезаписывает значения с + суммой
        }
        System.out.println("Баланс успешно пополнен"); // вывод
    }

    public void inPutMoney(int removeMoney) // интовый аргумент для снятия денег
    {
        {
            if (getBalance() > 0 && removeMoney <= getBalance()) // если на балансе сумма больше нуля, и в поле цифра меньшая или равна деньгам на счете
                setMoney(money - removeMoney); // перезаписываем значение через сеттер с минусом суммы из поля
        }
        System.out.println("Деньги успешно сняты"); // вывод
    }
}
