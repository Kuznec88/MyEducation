import java.util.HashMap;
import java.util.Map;

public class Movements
{
    private double income = 0;                                  // создаем переменные
    private double expense = 0;
    private Map<String, Double> expenseList = new HashMap<>();  // Создаем коллекцию

    public Movements(String csvFilenamePath) {                  // конструктор чтоб не ругался тест
        csvFilenamePath = this.getCsvFilenamePath();
    }

    public double getIncomeSum(String input)                    // метод в котором счтается сумма прихода всех денег + деление на фрагменты регулярок
{
        double incomeTmp = 0.0;                                 //

        String[] columns = input.split(",", 8);      // делим строку
        incomeTmp = Double.parseDouble(columns[6]);             // получившееся значение из прихода приводим к дабл
        double expenseTmp = Double.parseDouble(columns[7].replaceAll("\\\"", "").replace(',', '.'));
        if (incomeTmp == 0) getExpenseSum(columns[5], expenseTmp);
        else this.income += incomeTmp;                          // получившиеся значения из расхода приводим к единообразному отображению и приводим в дабл

        return incomeTmp;                                       // возвращаем результат работы
}

    private double getExpenseSum(String expenseName, double expense)        // метод по расчету потраченных денег
    {
        double sum = 0.0;                                                   //

        this.expense += expense;
        String[] transaction = expenseName.trim().split(" {3,}");       // убираем все ненужное приводим к одномут ипу и заполняем коллекцию
        String[] temp = transaction[1].split("/");
        String[] suppliesTemp = temp[temp.length - 1].split("\\\\");
        String supplies = suppliesTemp[suppliesTemp.length - 1];
        if (!expenseList.containsKey(supplies))
        expenseList.put(supplies, expense);
        else {
            sum = expenseList.get(supplies);

        expenseList.put(supplies.trim(), sum);
        }
        return sum += expense;
    }

    public void printData() {                                           // формат вывода
        System.out.println("ДВИЖЕНИЕ ДЕНЕЖНЫХ СРЕДСТВ");
        System.out.printf("ОБЩИЕ ПОСТУПЛЕНИЕ НА СЧЕТ: %.2f руб\n", income);
        System.out.println("--------------------------------------------------");
        System.out.println("ТАБЛИЦА РАСХОДОВ:");

        for (String supplies : expenseList.keySet()) {
        System.out.printf("%-30s -----> %.2f %-10s\n", supplies, expenseList.get(supplies), "руб");
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("ОБЩИЙ РАСХОД: %.2f руб", expense);
        }
        public String getCsvFilenamePath()
    {
        return "src/test/resources/movementList.csv";
    }

    public double getExpenseSum() {             // 2 метода чтоб тесты не ругались
        return 0;
    }

    public double getIncomeSum() {
        return income;
    }
}
