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
        while (!ioko.getStatus().equals("Dead")) { // кошка мяукает пока статус не будет деад, без break)
            ioko.meow(); // мяукает
            System.out.println("Йоко " + ioko.getStatus());// проверяем статус, при смерти перестает мяукать


            // 2 Задание
            manowar.pee(); // вызываем метод, в консоль выводится "agghhh"

            while (rhcp.isAlive) {

                rhcp.feed(150.00); // кормим на 150 гр

                System.out.println("Кот рхчп за все время съел " + rhcp.mealCount() + " грамм корма");  // проверка кол-ва еды


                rhcp.pee(); // кошак писает несколько раз
                System.out.println("Всего котов создано " + Cat.catCount); // вызываем счетчик котов при помощи слова Cat

            }
        }
    }
}