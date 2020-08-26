
public class ModulFive {

    private static final int PACIENTS_COUNT = 30; // коснтанта кол-во пациентов

    private static final double MIN_TEMPERATURE = 32.00; // константа минимальная температура
    private static final double MAX_TEMPERATURE = 40.00; // константа максимальная температура

    private static final double MIN_NORMALTEMPERATURE = 36.2; // константа минимальная температура для здорового человека
    private static final double MAX_NORMALTEMPERATURE = 36.9; // коонстанта максимальная температура для здорового человека


    public static void main(String[] args) {
        int countHealty = 0;

        double[] pacients = new double[PACIENTS_COUNT]; // создаем массив с константой кол-во пациентов
        for (int i = 0; i < pacients.length; i++) { // перебираем массив
            final double rnd = rnd(MIN_TEMPERATURE, MAX_TEMPERATURE); // создаем переменную определяющую минимальную и максимальную температуру
            pacients[i] = rnd; // присваиваем каждому пациенту температуру
            System.out.println(pacients[i]); // выводим в консоль
        }

        for (int b = 0; b < pacients.length; b++) { // перебираем массив
            if (pacients[b] > MIN_NORMALTEMPERATURE && pacients[b] < MAX_NORMALTEMPERATURE) // чтоб понять какой пациент здоров исходя из заданных температур
            {
                System.out.println("Пациент № " + b + " с температурой: " + pacients[b] + " - здоров"); // выводим
                ++countHealty;
            }
        }
        double average = 0; // пеерменная для среднего арифметического
        if (pacients.length > 0) { // логическое условие чтоб считать пациентов
            double sum = 0; // еще одна переменная для среднего арифметического
            for (int j = 0; j < pacients.length; j++) { // перебираем массив
                sum += pacients[j]; // суммируем все полученные температуры
            }
            average = sum / pacients.length; // делим сумму полученных температур на кол-во пациентов
        }
        System.out.println("Средняя температура по больнице: " + average); // выводим
        System.out.println("Здоровых пациентов: " + countHealty);
        }
    public static double rnd(double minTemperature, double maxTemperature) { // метод который задает рандомную температуру
        double diff = (maxTemperature - minTemperature) + 1;
        return (Math.random() * diff) + minTemperature;
    }
}

//        String[][] misterIks = {
//                {"X", " ", " ", " ", " ", " ", "X"},
//                {" ", "X", " ", " ", " ", "X", " "},
//                {" ", " ", "X", " ", "X", " ", " "},
//                {" ", " ", " ", "X", " ", " ", " "},
//                {" ", " ", "X", " ", "X", " ", " "},
//                {" ", "X", " ", " ", " ", "X", " "},
//                {"X", " ", " ", " ", " ", " ", "X"},
//
//        };
//        for (int i = 0; i < misterIks.length; i++) { //идём по строкам
//            for (int j = 0; j < misterIks[i].length; j++) {//идём по столбцам
//                System.out.print(" " + misterIks[i][j] + " "); //вывод элемента
//            }
//            System.out.println();//перенос строки ради визуального сохранения табличной формы
//        }
