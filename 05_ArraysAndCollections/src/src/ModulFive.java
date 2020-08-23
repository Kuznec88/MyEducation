
public class ModulFive {

    private static final int PACIENTS_COUNT = 30; // коснтанта кол-во пациентов

    private static final double MIN_TEMPERATURE = 32.00; // константа минимальная температура
    private static final double MAX_TEMPERATURE = 40.00; // константа максимальная температура

    private static final double MIN_NORMALTEMPERATURE = 36.2; // константа минимальная температура для здорового человека
    private static final double MAX_NORMALTEMPERATURE = 36.9; // коонстанта максимальная температура для здорового человека

   // final double rnd = rnd(MIN_TEMPERATURE, MAX_TEMPERATURE); //здесь непонятно

    public static void main(String[] args) {
        String[][] misterIks = {
                {"X", " ", " ", " ", " ", " ", "X"},
                {" ", "X", " ", " ", " ", "X", " "},
                {" ", " ", "X", " ", "X", " ", " "},
                {" ", " ", " ", "X", " ", " ", " "},
                {" ", " ", "X", " ", "X", " ", " "},
                {" ", "X", " ", " ", " ", "X", " "},
                {"X", " ", " ", " ", " ", " ", "X"},

        };
        for (int i = 0; i < misterIks.length; i++) { //идём по строкам
            for (int j = 0; j < misterIks[i].length; j++) {//идём по столбцам
                System.out.print(" " + misterIks[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }


//    public static void main(String[] args) {
//        double[] pacients = new double[PACIENTS_COUNT];
//        for (int i = 0; i < pacients.length; i++) {
//            final double rnd = rnd(MIN_TEMPERATURE, MAX_TEMPERATURE);
//            pacients[i] = rnd;
//            System.out.println(pacients[i]);
//        }
//    }
//
//    public static double rnd(double minTemperature, double maxTemperature) {
//        double diff = (maxTemperature - minTemperature) + 1;
//        return (int) (Math.random() * diff) + minTemperature;
//    }
}


//    public static void main(String[] args) {
//        String[] rainbow = {"Каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"}; //  тут начинается задание номер 1) с этим все ясно)
//        for (int i = 6; i >= 0; i--) {
//            System.out.println(rainbow[i]);
//        } // тут заканчивается задание 1)
//    }
}
