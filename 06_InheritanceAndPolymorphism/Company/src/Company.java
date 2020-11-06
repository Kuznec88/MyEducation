import java.util.List;

public class Company
{
    public static final double MANAGERPERCENT = 5.0 / 100; // константа с % для менеджера
    public static final double TOPMANAGERPERCENT = 150.0 / 100;// константа с % для топменеджера

    public static double companyMoney; // статическая переменная для счета денег

// public Company
// {
// List<Manager> allManager = new List<Manager>(); тут думал  сделать конструктор что когда создается компания сразу присваивается значения для персонала
// }

    List<Employee> getTopSalaryStaff(int count) // метод из задания
    {
        return null;
    }

    List<Employee> getLowestSalaryStaff(int count) // метод из задания
    {
        return null;
    }
    public static double getIncome() // возвращает деньги компании
    {
        return companyMoney;
    }
}
//
// public int hire() методы из задания
// {
// return
// }
// public int hireAll()
// {
//
// }
// public int fire()
// {
//
// }