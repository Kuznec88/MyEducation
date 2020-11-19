public class Main
{
    public static void main(String[] args)
    {

        Company company = new Company();
        company.hireALL();

// System.out.println(company.allEmployee);
        System.out.println();

        System.out.println( "Заработанные деньги компании " + company.getIncome());
        System.out.println( "Сотрудники " + company.employers);

//        for(Employee p : company.employers){
//
//            System.out.println(p.getMonthSalary());
            System.out.println(company.getTopSalaryStaff(5));
        }
    }