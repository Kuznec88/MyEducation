import java.time.LocalDateTime;

public class DepositAcc extends BankAccount {

    LocalDateTime month = LocalDateTime.now().plusMonths(1);

    public void Credit(int money) // конструктор с переменной из род. класса
    {
        super.money = money;
    }

    @Override
    public void putMoney(int addMoney) // при добавлении денег на счет вылазит надпись
        {
            System.out.println("Депозитный счет пополнен " + getBalance() + " снять деньги можно будет после: " + month + "\n");
        }

    @Override
    public void inPutMoney(int removeMoney) // при снятии денег
    {
        if (LocalDateTime.now().isAfter(month)) // если настоящая дата после переменной в которой + месяц
            inPutMoney(removeMoney); //то снимааются деньги
        else {
            System.out.println("Еще рано"); // в противоположном случае
        }
    }
}