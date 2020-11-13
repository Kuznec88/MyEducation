public class TopManager implements Employer {

    int fixedTopManagerSalary = 100000;
    public static final double TOPMANAGERPERCENT = 150.0 / 100;
    public Company company;
    int upperTopManagerSalary = fixedTopManagerSalary + (int) (fixedTopManagerSalary * TOPMANAGERPERCENT);

    public TopManager(Company company)
    {
        this.company = company;
        setCompanyMany();
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
    public void setCompanyMany() {
    }

    @Override
    public String toString() {
        return TopManager.class.getName() + " " + getMonthSalary() + "\n";
    }
}