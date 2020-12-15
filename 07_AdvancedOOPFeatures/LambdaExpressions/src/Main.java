import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Main
{
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) throws ParseException {

        ArrayList<Employee> staff = loadStaffFromFile();

        Date start = (new SimpleDateFormat(dateFormat)).parse("01.01.2017");
        Date end = (new SimpleDateFormat(dateFormat)).parse("31.12.2017");

        Optional<Employee> sort = staff.stream()
                .filter(employee -> employee.getWorkStart().after(start) && employee.getWorkStart().before(end))
                .max(Comparator.comparing(employee -> employee.getSalary()));
        System.out.print("Максимальная зп в 2017: " + sort.get().getSalary());

    }

    private static ArrayList<Employee> loadStaffFromFile()
    {
        ArrayList<Employee> staff = new ArrayList<>();
        try
        {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for(String line : lines)
            {
                String[] fragments = line.split("\t");
                if(fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                    fragments[0],
                    Integer.parseInt(fragments[1]),
                    (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}