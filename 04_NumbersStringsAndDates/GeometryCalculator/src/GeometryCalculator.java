public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius)
    {
        return 4 * Math.PI * (radius * radius); // расчет площади через радиус
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius)
    {
        return 4/3 * Math.PI * (radius * radius * radius); // расчет объема через радиус
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) // в этом методе есть ощущение что накосячил, но вроде не косячил
    {
        if (a + b > c || b + c > a || c + a > b)
        {
            return true;
        }
        else if(a + b == c || a + c == b || b + c == a)
        {
            return false;
        }
        else
        {
            return false;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) // расчет площади треугольника по формуле герона
    {
        double HalfPerimetr = (a + b + c) / 2;

        if (isTriangleRightAngled(a, b, c))
        {
            return Math.sqrt(HalfPerimetr * (HalfPerimetr - a) * (HalfPerimetr - b) * (HalfPerimetr - c));
        }
            else
            {
            return -1;
            }
    }
}
