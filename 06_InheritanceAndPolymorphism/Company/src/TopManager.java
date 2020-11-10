public class TopManager extends Company implements Employee {

    int fixedTopManagerSalary = 100000;
    int upperTopManagerSalary = fixedTopManagerSalary + (int) (fixedTopManagerSalary * TOPMANAGERPERCENT);

    @Override
    public double getMonthSalary() {
        if (companyMoney < 10000000)
        {
            return fixedTopManagerSalary;
        }
        if (companyMoney >= 10000000)
        {
            return upperTopManagerSalary;
        }
        return -1;
    }
    @Override
    public void setCompanyMoney()
    {
        super.setCompanyMoney(getIncome() + (double) fixedTopManagerSalary);
    }
}