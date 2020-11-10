public class Manager extends Company implements Employee {

    double moneyForCompany = 115000 + (int) (Math.random() * 140000);
    double fixedManagerSalary = 50000;

    public int managerSalary = (int) (fixedManagerSalary + (moneyForCompany * MANAGERPERCENT));

    @Override
    public double getMonthSalary()
    {
        return managerSalary;
    }
    @Override
    public void setCompanyMoney()
    {
        super.setCompanyMoney(getIncome() + moneyForCompany);
    }
}