public class Operator implements Employee {

    public int operatorSalary = 30000;
    public Company company;

    public Operator(Company company) {
        this.company = company;
        setCompanyMoney();
    }

    @Override
    public double getMonthSalary()
    {
        return operatorSalary;
    }

    @Override
    public void setCompanyMoney() {
    }

    @Override
    public String toString() {
        return Operator.class.getName() + " " + operatorSalary + "\n";
    }
}