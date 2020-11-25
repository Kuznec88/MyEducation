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
        System.out.println("Сотрудники с максимальной зп: " + company.getTopSalaryStaff(15));
        System.out.println("Сотрудники с минимальной зп: " + company.getLowestSalaryStaff(15));


        }
    }