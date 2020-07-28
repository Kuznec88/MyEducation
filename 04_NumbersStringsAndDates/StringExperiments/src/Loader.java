
public class Loader
{
    public static void main(String[] args)
    {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int sizeOfStr = text.length(); // переменная длина строки
        int sum = 0; // инициализируем переменную sum с дефолтным значением
        int tempNum = 0; // здесь инициализируем переменную которая вернет нам конкректную цифру из String

        for(int i = 0; i < sizeOfStr; ++i){ // цикл для перебора char
            if(Character.isDigit(text.charAt(i))){ // если char который передает нам цикл - цифра, то...
                tempNum = (10 * tempNum) + Character.getNumericValue(text.charAt(i)); // в переменной считаем значение цифры из текста и умножаем на 10 чтобы получилось целое число?
            } else // в другом случае...
                {
                sum += tempNum; // суммирует полученные числа
                tempNum = 0; // магия???
                }
        }
        sum += tempNum; // получаем переменную с суммой всех полученных чисел
        System.out.println("Ребята заработали суммарно " + sum); // выводим в консоль

        System.out.println(text);


        for(char i = 'a'; i <= 'z'; i++){ // задание 1
            int a = i;
            System.out.println("Для буквы " + i +" соотвестствует код " + a + ".");
        }
    }
}