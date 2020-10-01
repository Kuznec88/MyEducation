/* Список команд:
    balance == показать баланс счета
    put == положить денег
    take == снять деньги
 */


public class BankAccount{

    int balance;

    public BankAccount(int balance)
    {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
