public class Manager implements Employee {

    public long moneyForCompany = 115000 + (int) (Math.random() * 25000);
    public long fixedManagerSalary = 50000;
    public static final double MANAGERPERCENT = 5.0 / 100;
    public Company company;

    public double managerSalary = (fixedManagerSalary + (moneyForCompany * MANAGERPERCENT));

    public Manager(Company company)
    {
        this.company = company;
        setCompanyMoney();
    }

    @Override
    public double getMonthSalary()
    {
        return managerSalary;
    }

    @Override
    public void setCompanyMoney() {
        company.setCompanyMoney(moneyForCompany);
    }

    @Override
    public String toString() {
        return Manager.class.getName() + " " + managerSalary + "\n";
    }
}