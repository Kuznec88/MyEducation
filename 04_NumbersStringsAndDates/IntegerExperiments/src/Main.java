public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits());

    }

    public static Integer sumDigits()
    {
        Integer a = 12345;
        Integer b = 10;
        Integer c = 5059191;

        return a + b + c;
    }
}