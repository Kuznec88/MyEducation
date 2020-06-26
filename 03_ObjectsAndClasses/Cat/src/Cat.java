
public class Cat
{

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double mealCount; // создаем переменную для счетчика еды

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;


    }
    public void pee() // создаем метод
    {
        weight = weight - 20; // при вызове метода вес кошака меняется на -20
        System.out.println("Agghhh"); // печатаем в консоль эмоции кошки
    }
    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        mealCount += amount; // счетчик еды
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public double getWeight()
    {
        return weight;
    }
    public double mealCount() // метод по возврату съеденной еды
    {
        return mealCount;
    }
    static int catCount; // счетчик котов
    {
        catCount++;
        if (weight < minWeight)
            catCount--;
        else if (weight > maxWeight)
            catCount--;
    }
    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}