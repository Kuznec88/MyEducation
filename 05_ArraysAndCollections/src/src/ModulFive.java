import org.w3c.dom.ls.LSOutput;

public class ModulFive {

    private static final int PACIENTS_COUNT = 30; // коснтанта кол-во пациентов

    private static final double MIN_TEMPERATURE = 32.00; // константа минимальная температура
    private static final double MAX_TEMPERATURE = 40.00; // константа максимальная температура

    private static final double MIN_NORMALTEMPERATURE = 36.2; // константа минимальная температура для здорового человека
    private static final double MAX_NORMALTEMPERATURE = 36.9; // коонстанта максимальная температура для здорового человека

    final double rnd = rnd(MIN_TEMPERATURE, MAX_TEMPERATURE); //здесь непонятно

    public static void main(String[] args) {
        String[] rainbow = {"Каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"}; //  тут начинается задание номер 1) с этим все ясно)
        for (int i = 6; i >= 0; i--) {
            System.out.println(rainbow[i]);
        } // тут заканчивается задание 1)

        public static double rnd
        (MIN_TEMPERATURE, MAX_TEMPERATURE) // допустим выношу рандом в отдельный метод, сомневаюсь что это надо делать но делаю)
        {
            MAX_TEMPERATURE -= MIN_TEMPERATURE; // здесть вычисляем на какое значение будет рандомится
            return (int) (Math.random() * ++MAX_TEMPERATURE) + MIN_TEMPERATURE; // здесь непонятно, получается что рандом * на инкрементируемую макс.температуру и + мин.температура

            int[] pacients = new int[PACIENTS_COUNT]; // создаем массив из константы понятно
            for (int i = 0; i < pacients.length; i++) //перебираем
            {
                System.out.println(pacients[i]);
            }
        }
    }
}

