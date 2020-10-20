public class CreditAcc extends BankAccount
    {

    private static final double PERCENT = 1/100; // объявили константу с 1%

    public void Credit(int money) // конструктор для другого аккаунта
    {
        super.money = money; // при вызове конструктора для аккаунта присваивается значение из переменной находящейся в родительском классе
    }

    @Override
    public void inPutMoney(int removeMoney) // переопределяем метод для этого класса
    {
        if(removeMoney > 0 && removeMoney <= getBalance()) // если сумма в поле больше нуля и поле меньше или равно балансу
        {
            Credit((int) (getBalance() - (removeMoney + ((removeMoney) * PERCENT))));
            /* приводим к типу инт шоб не ругался на %,
            дальше из полученного баланса мы вычитаем сумму из поля с прибавленным 1%
            от введенной суммы
             */
        }
            System.out.println("Кредитные бабки " + getBalance()); // вывод
        }
    }