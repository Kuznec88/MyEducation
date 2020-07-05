import java.util.Objects;

public class Cat {

    public static final int EYE_COUNT = 2; // задание 3.4
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;

    public static int catCount; // правильно понял что переменную для счетчика надо засунуть сюда?
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double mealCount; // создаем переменную для счетчика еды

    public boolean isAlive = (weight <= maxWeight && weight >= minWeight); // здесь создал булеан проверяющий жива кошка или нет

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        catCount++; // а сюда засунуть сам счетчик?
    }

    public void pee() // создаем метод
    {
        weight = weight - 20; // при вызове метода вес кошака меняется на -20
        System.out.println("Agghhh"); // печатаем в консоль эмоции кошки
    }

    public void meow() {

        if (isAlive = true);{

            weight = weight - 1;

            System.out.println("Meow");

            if (weight < minWeight) {

                catCount--;

                if (isAlive = false) {

                    System.out.println("Кошка мертва"); // здесь поидее должна выводиться надпись, но т.к у нас метод войд, она не выводится
                }
            }
        }
    }

        public void feed (Double amount) {
            if (isAlive = true) {

                weight = weight + amount;

                mealCount += amount; // счетчик еды

                if (weight < maxWeight){

                    catCount--;

                    if (isAlive = false){

                        System.out.println("Кошак мертв");
                    }
                }
            }
        }

        public void drink (Double amount){

        if (weight <= maxWeight && weight >= minWeight) {

        weight = weight + amount;

        mealCount += amount; // счетчик еды

        if (weight < maxWeight){

            catCount--;
        }
    }
}
        public double getWeight ()
        {
            return weight;
        }
        public double mealCount () // метод по возврату съеденной еды
        {
            return mealCount;
        }
        public String getStatus ()
        {
            if (weight < minWeight) {
                return "Dead";
            } else if (weight > maxWeight) {
                return "Exploded";
            } else if (weight > originWeight) {
                return "Sleeping";
            } else {
                return "Playing";
            }
        }
    }


