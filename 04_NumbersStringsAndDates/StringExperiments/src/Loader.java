import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        String safe = "12345678910111213";// до 11 символа
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int sizeOfStr = text.length(); // переменная длина строки
        int sum = 0; // инициализируем переменную sum с дефолтным значением
        int tempNum = 0; // здесь инициализируем переменную которая вернет нам конкректную цифру из String

        for (int i = 0; i < sizeOfStr; ++i) { // цикл для перебора char
            if (Character.isDigit(text.charAt(i))) { // если char который передает нам цикл - цифра, то...
                tempNum = (10 * tempNum) + Character.getNumericValue(text.charAt(i)); // в переменной считаем значение цифры из текста и умножаем на 10 чтобы получилось целое число?
            } else // в другом случае...
            {
                sum += tempNum; // суммирует полученные числа
                tempNum = 0; // обнуляем переменную чтобы цикл отработал заново
            }
        }
        sum += tempNum; // получаем переменную с суммой всех полученных чисел
        System.out.println("Ребята заработали суммарно " + sum); // выводим в консоль

        System.out.println(text);


        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char c : alphabet.toCharArray()) {
            System.out.println("Для буквы " + c + " " + "соотвестствует код " + (int) c);
        }

        Scanner scanner = new Scanner(System.in); // создаем сканнер
        System.out.println("Введите ФИО: "); // просим ввести ФИО
        String fullName = scanner.nextLine(); // считываем следующую строку

        int firstIndex = fullName.indexOf(" "); // получаем пробел, первый пробел в строке будет точкой отсчета
        int lastIndex = fullName.lastIndexOf(" "); // и где заканчивается

        String firstName = fullName.substring(0, firstIndex); // считываем фамилию, первый символ 0 и последний там где первый пробел
        String lastName = fullName.substring(firstIndex + 1, lastIndex);// пробел + 1 символ, начало следующего ввода
        String otherName = fullName.substring(lastIndex + 1);// предыдущая точка "закрытия" + 1 символ

        System.out.println("Фамилия: " + firstName); // выводим в консоль
        System.out.println("Имя: " + lastName);
        System.out.println("Отчество: " + otherName);

        }
//        public static String searchAndReplaceDiamonds(String safe) {
//        int num = safe.length();
//        int firstDigit = safe.indexOf(0);
//        int lastDigit = safe.indexOf(11);
//        StringBuffer maskedbuf = new StringBuffer(safe.substring(firstDigit, lastDigit));
//        for (int i = firstDigit; i < lastDigit; i++) {
//            maskedbuf.append('*');
//
//            return searchAndReplaceDiamonds("1234567891011213");
//        }
//        System.out.println(searchAndReplaceDiamonds(safe));
    }