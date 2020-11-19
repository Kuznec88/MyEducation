public class TopManager implements Employee {

    int fixedTopManagerSalary = 100000;
    public static final double TOPMANAGERPERCENT = 150.0 / 100;
    public Company company;
    int upperTopManagerSalary = fixedTopManagerSalary + (int) (fixedTopManagerSalary * TOPMANAGERPERCENT);

    public TopManager(Company company)
    {
        this.company = company;
        setCompanyMoney();
    }

    @Override
    public double getMonthSalary()
    {
        if (company.getIncome() < 10000000)
        {
            return fixedTopManagerSalary;
        }
        if (company.getIncome() >= 10000000)
        {
            return upperTopManagerSalary;
        }
        return -1;
    }

    @Override
    public void setCompanyMoney() {
    }

    @Override
    public String toString() {
        return TopManager.class.getName() + " " + getMonthSalary() + "\n";
    }
}