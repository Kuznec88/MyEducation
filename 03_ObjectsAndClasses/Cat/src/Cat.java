import java.util.Objects;

public class Cat {

    public static final int EYE_COUNT = 2; // задание 3.4
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;

    public static int catCount; // правильно понял что переменную для счетчика надо засунуть сюда?
    private double originWeight;
    private double weight;

    private double mealCount; // создаем переменную для счетчика еды

    public boolean isAlive = true;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        catCount++; // а сюда засунуть сам счетчик?
    }

    public void pee() // создаем метод
    {
        weight = weight - 20; // при вызове метода вес кошака меняется на -20
        System.out.println("Agghhh"); // печатаем в консоль эмоции кошки
    }

    public void meow() {

        if (weight <= Cat.MAX_WEIGHT && weight >= Cat.MIN_WEIGHT) {

            weight = weight - 1;

            System.out.println("Meow");

            if (weight < Cat.MIN_WEIGHT) {

                catCount--;

            }
        }
    }

        public void feed (Double amount) {

            if (isAlive) {

                weight = weight + amount;

                mealCount += amount; // счетчик еды

                if (weight > Cat.MAX_WEIGHT){

                    isAlive = false;

                    catCount--;

                    }
                }
            }

        public void drink (Double amount) {

        if (isAlive) {

        weight = weight + amount;

        if (weight > Cat.MAX_WEIGHT){

            isAlive = false;

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
                if (weight < Cat.MIN_WEIGHT) {
                    return "Dead";
                } else if (weight > Cat.MAX_WEIGHT) {
                    return "Exploded";
                } else if (weight > originWeight) {
                    return "Sleeping";
                } else {
                    return "Playing";
                }
            }
        }


