import java.util.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<StringBuilder> beatifulNum = new ArrayList<>();
        Collections.sort(beatifulNum);
//        HashSet<String> beatifulNum2 = new HashSet<>();
//        beatifulNum2.addAll(beatifulNum);
//        TreeSet<StringBuilder> beatifulNum3 = new TreeSet<>();
//        beatifulNum3.addAll(beatifulNum);

        String[] letters = {"С", "М", "Т", "В", "А", "Р", "О", "Н", "Е", "У", "Х", "К"};
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};


        for (int let1 = 0; let1 < letters.length; let1++) {
            for (int num1 = 0; num1 < digits.length; num1++) {
                for (int num2 = 0; num2 < digits.length; num2++) {
                    for (int num3 = 0; num3 < digits.length; num3++) {
                        for (int let2 = 0; let2 < letters.length; let2++) {
                            for (int let3 = 0; let3 < letters.length; let3++) {
                                for (int region = 1; region <= 199; region++) {


                                    StringBuilder sb = new StringBuilder(letters[let1] + num1 + num2 + num3 + letters[let2] + letters[let3] + region);
                                    beatifulNum.add(sb);
                                }
                            }
                        }
                    }
                }
            }
        }




//            System.out.println("Введи интересующий номер: ");
//            Scanner scanner = new Scanner(System.in);
//            String number = scanner.nextLine();
//
//            Long start = System.nanoTime();
//            Long duration = System.nanoTime() - start;
//
//
//            if (beatifulNum2.contains(number)) {
//                System.out.println("Время поиска по хэшсету составило: " + duration + " мс");
//            }
//            if (beatifulNum.contains(number)) {
//                System.out.println("Время поиска с помощью перебора составило: " + duration + " мс");
//            }
//            Collections.binarySearch(beatifulNum, number);
//            {
//                System.out.println("Время поиска с помощью бинарного поиска составило: " + duration + " мс");
//            }
//            if (beatifulNum3.contains(number)) {
//                System.out.println("Время поиска по трисету составило: " + duration + " мс");
//            }

        }
    }
