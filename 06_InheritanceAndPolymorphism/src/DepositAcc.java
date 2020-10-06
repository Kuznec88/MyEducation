class Deposit extends BankAccount{

    public void depAcc(int money)
    {
        this.money = money;
    }

    @Override
    public void inPutMoney(int removeMoney) {
        super.inPutMoney(removeMoney);
    }
}