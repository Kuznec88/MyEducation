import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Movements {

    List<Double> income = new ArrayList<>();
    List<Double> expense = new ArrayList<>();

    public Movements(String pathMovementsCsv) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(pathMovementsCsv));
            for (; ; ) {

                String line = br.readLine();
                if (line == null) {
                    break;
                }

                String[] fragments = line.split("\\,");

//                if(fragments[7].contains(","))
//                {
//                    line.split(" ");
//                }

                String income1 = fragments[6].replaceAll("[^\\d.]", "0");
                String expense1 = fragments[7].replaceAll("[^\\d.]", "0");

                income.add(Double.parseDouble(income1));
                expense.add(Double.parseDouble(expense1));

//                        System.out.println(income1 + " " + expense1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public double getExpenseSum() {
        double totalExpense = 0.0;

        for (Double expense2 : expense) {
            totalExpense += expense2;
        }
        return totalExpense;
    }


    public double getIncomeSum() {
        double totalIncome = 0.0;

        for (Double income2 : income) {
            totalIncome += income2;
        }
        return totalIncome;
    }
}
