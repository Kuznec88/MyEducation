public class Cat {

    public static final int EYE_COUNT = 2; // задание 3.4
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;

    public static int catCount; // правильно понял что переменную для счетчика надо засунуть сюда?
    private double originWeight;
    private double weight;

    private double mealCount; // создаем переменную для счетчика еды


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        catCount++; // а сюда засунуть сам счетчик?
    }

    public boolean alive() // добавил метод
    {
        return weight <= Cat.MAX_WEIGHT && weight >= Cat.MIN_WEIGHT;
    }

    public boolean countBack() // еще один добавил
    {
        boolean b = weight < Cat.MIN_WEIGHT;

        return b;
    }
    public void pee() // создаем метод
    {
        weight = weight - 20; // при вызове метода вес кошака меняется на -20
        System.out.println("Agghhh"); // печатаем в консоль эмоции кошки
    }

    public void meow() {

        if (alive()) {

            weight = weight - 1;

            System.out.println("Meow");

            if (countBack()) {

                catCount--;

            }
        }
    }

        public void feed (Double amount) {

            if (alive()) {

                weight = weight + amount;

                mealCount += amount; // счетчик еды

                if (countBack()) {

                    catCount--;
                }
            }
        }

        public void drink (Double amount) {

        if (alive()) {

        weight = weight + amount;

        if (weight > Cat.MAX_WEIGHT){

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


