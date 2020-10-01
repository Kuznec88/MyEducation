import java.util.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> beatifulNum = new ArrayList<>();
        Collections.sort(beatifulNum);

        HashSet<String> beatifulNum2 = new HashSet<>();

        TreeSet<String> beatifulNum3 = new TreeSet<>();


        String[] letters = {"С", "М", "Т", "В", "А", "Р", "О", "Н", "Е", "У", "Х", "К"};
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int let1 = 0; let1 < letters.length; let1++) {
            for (int num1 = 0; num1 < digits.length; num1++) {
                for (int num2 = 0; num2 < digits.length; num2++) {
                    for (int num3 = 0; num3 < digits.length; num3++) {
                        for (int let2 = 0; let2 < letters.length; let2++) {
                            for (int let3 = 0; let3 < letters.length; let3++) {
                                String sb = letters[let1] + num1 + num2 + num3 + letters[let2] + letters[let3];
                                beatifulNum.add(sb);
                                beatifulNum2.add(sb);
                                beatifulNum3.add(sb);
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Введи интересующий номер: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int findNum = Collections.binarySearch(beatifulNum, number);


        if (beatifulNum.contains(number))
        {
            long start = System.nanoTime();
            System.out.println("Такой номер существует, время поиска с помощью перебора составило: " + (System.nanoTime() - start + " мс"));
        }else{
            long start = System.nanoTime();
            System.out.println("Такого номера не существует, время поиска составило: " + (System.nanoTime() - start + " мс"));
        }
        if (findNum > 0)
        {
            long start = System.nanoTime();
            System.out.println("Такой номер существует, время поиска с помощью бинарного поиска составило: " + (System.nanoTime() - start + " мс"));
        }else{
            long start = System.nanoTime();
            System.out.println("Такого номера не существует, время с помощью бинарного поиска составило: " + (System.nanoTime() - start + " мс"));
        }
        if (beatifulNum3.contains(number)) {
            long start = System.nanoTime();
            System.out.println("Такой номер существует, время поиска по трисету составило: " + (System.nanoTime() - start + " мс"));
        }else {
            long start = System.nanoTime();
            System.out.println("Такого номера не существует, время поиска по трисету составило: " + (System.nanoTime() - start + " мс"));
        }
        if (beatifulNum2.contains(number)) {
            long start = System.nanoTime();
            System.out.println("Такой номер существует, время поиска по хэшсету составило: " + (System.nanoTime() - start + " мс"));
        }else {
            long start = System.nanoTime();
            System.out.println("Такого номера не существует, время поиска по хэшсету составило: " + (System.nanoTime() - start + " мс"));
        }
    }
}
//"Время поиска по хэшсету составило: " + duration + " мс"
