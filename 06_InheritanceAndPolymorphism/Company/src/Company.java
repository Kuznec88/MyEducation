import java.util.ArrayList;
import java.util.List;

public class Company
{
    public static final double MANAGERPERCENT = 5.0 / 100;
    public static final double TOPMANAGERPERCENT = 150.0 / 100;

    public static double companyMoney;

    ArrayList<Object> allEmpoyee = new ArrayList<>();

    List<Employee> getTopSalaryStaff(int count)
    {
        return null;
    }

    List<Employee> getLowestSalaryStaff(int count)
    {
        return null;
    }

    public static double getIncome()
    {
        return companyMoney;
    }
    public void setCompanyMoney(Double companyMoney)
    {
        Company.companyMoney = companyMoney;
    }
    public void hireManager()
    {
        allEmpoyee.add(new Manager());
    }
    public void hireTopManager()
    {
        allEmpoyee.add(new TopManager());
    }
    public void hireOperator()
    {
        allEmpoyee.add(new Operator());
    }

// public int hireAll()
// {
//
// }
// public int fire()
// {
//
// }
}