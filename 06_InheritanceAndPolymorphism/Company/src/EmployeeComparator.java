import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    public EmployeeComparator(int count) {
    }

    public EmployeeComparator() {

    }

    @Override
    public int compare(Employee o1, Employee o2)
    {
        if(o1.getMonthSalary() > o2.getMonthSalary())
        {
            return -1;
        }
        if (o1.getMonthSalary() < o2.getMonthSalary())
        {
            return 1;
        }else{
            return 0;
        }
    }
}
