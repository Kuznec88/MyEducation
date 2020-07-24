public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;


        System.out.println(sumDigits(5059191));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(12345));

    }

    public static Integer sumDigits(Integer number) {
        number = Math.abs(number);
        String str = number.toString();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        return (int) sum;
    }
}
