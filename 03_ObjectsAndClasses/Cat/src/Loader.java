import java.sql.SQLOutput;

public class Loader {
    public static void main(String[] args) {
        // 1 задание
        Cat offspring = new Cat(); // создали кота
        Cat manowar = new Cat(); // создали кота
        Cat rhcp = new Cat(); // создали кота

        Cat maffin = new Cat(); // создали кота
        System.out.println("Вес Маффина " + maffin.getWeight()); // получаем вес кота и выводим в консоль
        maffin.feed(9001.00 - maffin.getWeight()); // кормим ровно тем количеством корма + 1 чтобы кот взорвлся, без цикла
        System.out.println("Маффин съел " + maffin.mealCount() + " грамм корма");
        System.out.println(maffin.getStatus()); // вызываем статус


        Cat ioko = new Cat(); // создали кота
        System.out.println("Вес Йоко " + ioko.getWeight()); // получаем вес и выводим в консоль
        while (ioko.getWeight() >= 1000.0) { // цикл если вес кошки больше либо равен минимальному, кошка продолжала бы мяукать если бы не было break)
            ioko.meow(); // мяукает
            System.out.println(ioko.getStatus()); // проверяем статус, при смерти перестает мяукать


            // 2 Задание
            manowar.pee(); // вызываем метод, в консоль выводится "agghhh"
            rhcp.feed(150.00); // кормим на 150 гр
            rhcp.feed(200.00); //кормим + 200 гр
            rhcp.pee(); // кошак писает несколько раз
            rhcp.pee();
            rhcp.pee();
            rhcp.pee();
            System.out.println("Кот рхчп за все время съел " + rhcp.mealCount() + " грамм корма");  // проверка кол-ва еды
            System.out.println("Всего котов создано " + Cat.catCount); // вызываем счетчик котов при помощи слова Cat
            System.out.println();
            break;
        }
    }
}