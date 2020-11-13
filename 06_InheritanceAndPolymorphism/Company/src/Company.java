import java.util.ArrayList;
import java.util.List;

public class Company {
    public long companyMoney = 0; // хранятся деньги

    List<Employer> employers = new ArrayList<Employer>(); // коллекция со всеми работниками

    public void hire(Employer someEmp) // принимает на вход объект
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

    ArrayList<Object> allEmployee = new ArrayList<>();

    List<Employer> getTopSalaryStaff(int count)
    {
        return null;
    }

    List<Employer> getLowestSalaryStaff(int count)
    {
        return null;
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