import java.util.List;

public class Main
{
    public static void main(String[] args)
    {

        Company company = new Company();

        company.hireManager();
        company.hireOperator();
        company.hireTopManager();

        System.out.println(company.allEmpoyee);

        Operator operator = new Operator();
        System.out.println(operator.getMonthSalary());
        TopManager topManager = new TopManager();
        System.out.println(topManager.getMonthSalary());

        System.out.println(company.toString());
        System.out.println( "Заработанные деньги компании " + Company.getIncome());
    }
}