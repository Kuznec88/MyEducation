public class Main {
    public static void main(String[] args) {
        char a = (char)-1;
        char b = (char) 0;

        System.out.println("Максимальное занчение для Byte " + Byte.MAX_VALUE);
        System.out.println("Минимальное значение для Byte " + Byte.MIN_VALUE);
        System.out.println("Максимальное занчение для Int " + Integer.MAX_VALUE);
        System.out.println("Минимальное значение для Int " + Integer.MIN_VALUE);
        System.out.println("Максимальное занчение для Short " + Short.MAX_VALUE);
        System.out.println("Минимальное значение для Short " + Short.MIN_VALUE);
        System.out.println("Максимальное занчение для Long " + Long.MAX_VALUE);
        System.out.println("Минимальное значение для Long " + Long.MIN_VALUE);
        System.out.println("Максимальное занчение для Float " + Float.MAX_VALUE);
        System.out.println("Минимальное значение для Float " + -Float.MAX_VALUE);
        System.out.println("Максимальное занчение для Double " + Double.MAX_VALUE);
        System.out.println("Минимальное значение для Double " + -Double.MAX_VALUE);
        System.out.println("Максимальное значение для Char в числовом выражении " + (int)a);
        System.out.println("Минимальное значение для Char в числовом выражении " + (int)b);
    }
}
