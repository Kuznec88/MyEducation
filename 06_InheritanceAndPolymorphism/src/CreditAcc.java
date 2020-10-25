public class CreditAcc extends BankAccount {

    private static final double PERCENT = 1 / 100;

    @Override
    public void putMoney(int addMoney) {
        if (addMoney > 0) {
            super.putMoney(addMoney);
        }
        System.out.println("Кредитный счет пополнен на: " + getBalance());
    }

    @Override
    public void inPutMoney(int removeMoney) {
        double d = getBalance() - (removeMoney + ((removeMoney) * PERCENT));
        if(removeMoney > 0 && d >= 0) {
            super.money = (int) d;
        }
        System.out.println("Кредитные бабки " + getBalance());
    }
}