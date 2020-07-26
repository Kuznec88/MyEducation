public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius)
    {
        return 4 * Math.PI * (Math.pow(Math.abs(radius), 2)); // расчет площади через радиус
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius)
    {
        return 4/3 * Math.PI * (Math.pow(Math.abs(radius), 3)); // расчет объема через радиус
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) // в этом методе есть ощущение что накосячил, но вроде не косячил
    {
        return a + b > c && b + c > a && c + a > b;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) // расчет площади треугольника по формуле герона
    {
        double halfPerimetr = (a + b + c) / 2;

        if (isTriangleRightAngled(a, b, c))
        {
            return Math.sqrt(halfPerimetr * (halfPerimetr - a) * (halfPerimetr - b) * (halfPerimetr - c));
        }
            else
            {
            return -1;
            }
    }
}
