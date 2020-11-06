import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Company company = new Company(); // тут тестил все это

        Manager manager = new Manager();
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();

        System.out.println(manager.getMonthSalary());
        System.out.println(manager1.getMonthSalary());
        System.out.println(manager2.getMonthSalary());

        Operator operator = new Operator();
        System.out.println(operator.getMonthSalary());
        TopManager topManager = new TopManager();
        System.out.println(topManager.getMonthSalary());

        System.out.println( "Заработанные деньги компании " + Company.getIncome());
    }
}