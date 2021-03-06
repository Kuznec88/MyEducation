import java.util.*;

public class Company extends EmployeeComparator{
    public long companyMoney = 0; // хранятся деньги

    EmployeeComparator pcomp = new EmployeeComparator();
    List<Employee> employers = new ArrayList<Employee>(); // коллекция со всеми работниками
//    TreeSet<Employee> employers = new TreeSet<Employee>(pcomp);

    public Company(int count) {
        super(count);
    }

    public Company() {
        super();
    }


    public void hire(Employee someEmp) // принимает на вход объект
    {
        employers.add(someEmp); // добавляет
    }

    public void hireALL() { // добавляет в коллекцию необходимое кол-во работнков
        for (int i = 0; i < 80; i++)
        {
            hire(new Manager(this));
        }
        for (int i = 0; i < 180; i++)
        {
            hire(new Operator(this));
        }
        for (int i = 0; i < 10; i++)
        {
            hire(new TopManager(this));
        }
    }

    List<Employee> getTopSalaryStaff(int count)
    {
        Collections.sort(employers, pcomp);
        return employers.subList(0, Math.min(count, employers.size()));
    }

    List<Employee> getLowestSalaryStaff(int count)
    {
        Collections.sort(employers, pcomp);
        Collections.reverse(employers);
        return employers.subList(0, Math.min(count, employers.size()));
    }

    public long getIncome() // возвращает сумму денег
    {
        return companyMoney;
    }

    public void setCompanyMoney(long moneyForCompany) // суммирует все заработанные деньги
    {
        companyMoney = companyMoney + moneyForCompany;
    }
}