public class Operator implements Employer {

    public int operatorSalary = 30000;
    public Company company;

    public Operator(Company company) {
        this.company = company;
        setCompanyMany();
    }

    @Override
    public double getMonthSalary()
    {
        return operatorSalary;
    }

    @Override
    public void setCompanyMany() {
    }

    @Override
    public String toString() {
        return Operator.class.getName() + " " + operatorSalary + "\n";
    }
}