public class Operator extends Company implements Employee {
    public int operatorSalary = 30000;

    @Override
    public double getMonthSalary()
    {
        return operatorSalary;
    }

    @Override
    public void setCompanyMoney()
    {
        super.setCompanyMoney(getIncome() + (double) operatorSalary);
    }
}