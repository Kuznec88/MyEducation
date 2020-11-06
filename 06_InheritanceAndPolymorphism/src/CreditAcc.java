public class CreditAcc extends BankAccount {// может использоваться в классе main

    private static final double PERCENT = 1.0 / 100; // используется только в рамках этого класса

    @Override
    public void putMoney(int addMoney) { //используется в рамках пакета
        if (addMoney > 0)
        {
            super.putMoney(addMoney);
        }
        System.out.println("Кредитный счет пополнен на: " + getBalance());
    }

    @Override
    public void inPutMoney(int removeMoney) { // используется в рамках пакета
        double d = getBalance() - (removeMoney + ((removeMoney) * PERCENT));
        if(removeMoney > 0 && d >= 0)
        {
            setMoney ((int) d);
        }
        System.out.println("Кредитные бабки " + getBalance());
    }
}