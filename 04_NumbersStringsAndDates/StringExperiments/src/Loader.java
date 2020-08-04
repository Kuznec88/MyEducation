import java.util.Scanner;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {
        String bbcNews = "Australia's virus-hit state of Victoria has reported its worst death toll and case rise, prompting fears that a six-week lockdown of state capital Melbourne is not working.\n" +
                "\n" +
                "The state confirmed 13 new deaths and 723 new cases on Thursday - a 36% jump on the case record set on Monday.\n" +
                "\n" +
                "There are fears now that Melbourne's lockdown, which began on 7 July, will need to be extended.\n" +
                "\n" +
                "The spike meant Australia overall had its deadliest day in the pandemic.\n" +
                "\n" +
                "A 14th person died late on Thursday but his death will be included in Friday's figures as it was announced after the government's briefing.\n" +
                "\n" +
                "Officials in Victoria renewed appeals for people with symptoms to get tested quickly.\n" +
                "\n" +
                "Last week, the Victorian government said sick people breaking isolation rules - or not getting tested in time - was leading to continued spread despite lockdown measures.\n" +
                "\n" +
                "\"If you've got symptoms, the only thing you can do is get tested,\" said Premier Daniel Andrews.\n" +
                "\n" +
                "\"You just can't go to work. Because all you'll be doing is spreading the virus.\"\n" +
                "\n" +
                "Thursday's figures dash hopes that recent lower case numbers indicated the state had turned a corner.";

        String[] space = bbcNews.split("\\s+"); // задание с текстом и регулярными выражениями
        bbcNews.replaceAll("\\p{Punct}", "");

        for (int i = 0; i < space.length; i++)

            System.out.println(space[i]);
            System.out.println(" количество слов " + space.length);



        String safe = " <1234567891011>1213"; // задание со звездочкой

        int n = safe.indexOf('<');
        int k = safe.indexOf('>');

        System.out.println(safe.substring(0, n) + "**************" + safe.substring(k + 1));


        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        String [] digits = text.split("\\D+"); // неужели сделал))???
        int first = Integer.parseInt (digits[1]); // единственное непонял, почему у меня массив начинается с 1 а не с 0?
        int second = Integer.parseInt (digits[2]); // это как то связано с методом сплит?
        int third = Integer.parseInt (digits[3]);

        int sum = first + second + third;

        System.out.println(sum);

//        int sizeOfStr = text.length(); // переменная длина строки
//        int sum = 0; // инициализируем переменную sum с дефолтным значением
//        int tempNum = 0; // здесь инициализируем переменную которая вернет нам конкректную цифру из String
//
//        for (int i = 0; i < sizeOfStr; ++i) { // цикл для перебора char
//            if (Character.isDigit(text.charAt(i))) { // если char который передает нам цикл - цифра, то...
//                tempNum = (10 * tempNum) + Character.getNumericValue(text.charAt(i)); // в переменной считаем значение цифры из текста и умножаем на 10 чтобы получилось целое число?
//            } else // в другом случае...
//            {
//                sum += tempNum; // суммирует полученные числа
//                tempNum = 0; // обнуляем переменную чтобы цикл отработал заново
//            }
//        }
//        sum += tempNum; // получаем переменную с суммой всех полученных чисел
//        System.out.println("Ребята заработали суммарно " + sum); // выводим в консоль


        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char c : alphabet.toCharArray()) {
            System.out.println("Для буквы " + c + " " + "соотвестствует код " + (int) c);
        }

        Scanner scanner = new Scanner(System.in); // создаем сканнер
        System.out.println("Введите ФИО: "); // просим ввести ФИО
        String fullName = scanner.nextLine(); // считываем следующую строку

        String[] firstName = fullName.split("\\s+"); // считываем фамилию, первый символ 0 и последний там где первый пробел
        String[] lastName = fullName.split("\\s+");// пробел + 1 символ, начало следующего ввода
        String[] otherName = fullName.split("\\s+");// предыдущая точка "закрытия" + 1 символ


        System.out.println("Фамилия: " + firstName[0]); // выводим в консоль
        System.out.println("Имя: " + lastName[1]);
        System.out.println("Отчество: " + otherName[2]);

        }
    }
