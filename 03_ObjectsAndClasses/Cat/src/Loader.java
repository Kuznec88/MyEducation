import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Loader {
    public static void main(String[] args) {

        System.out.println(getKitten()); // создаем 3 кота
        System.out.println(getKitten());
        System.out.println(getKitten());

        // 1 задание
        Cat offspring = new Cat(); // создали кота
        Cat manowar = new Cat(); // создали кота
        Cat rhcp = new Cat(); // создали кота

        Cat maffin = new Cat(); // создали кота
        System.out.println("Вес Маффина " + maffin.getWeight()); // получаем вес кота и выводим в консоль
        maffin.feed(9001.00 - maffin.getWeight()); // кормим ровно тем количеством корма + 1 чтобы кот взорвлся, без цикла
        System.out.println("Маффин съел " + maffin.mealCount() + " грамм корма" + " и " + maffin.getStatus()); // печатаем в консоль кол-во корма + статус

        offspring.pee(); // кошак писает

        Cat cat1 = new Cat(2300.00, "Vaska", 3 );
        System.out.println(cat1);
        System.out.println(Cat.catCount);
        System.out.println("Создаем копию кота???  " + cat1.CatCopy());


        //Cat ioko = new Cat(); // создали кота
        //System.out.println("Вес Йоко " + ioko.getWeight()); // получаем вес и выводим в консоль
        //while (!ioko.getStatus().equals("Dead")) { // кошка мяукает пока статус не будет деад, без break)
           // ioko.meow(); // мяукает
           // System.out.println("Йоко " + ioko.getStatus());// проверяем статус, при смерти перестает мяукать

            Cat cat = new Cat(); // создали кота
            System.out.println("Всего котов создано " + Cat.catCount);
            while (!cat.getStatus().equals("Dead")) {
                cat.meow();
            }
            System.out.println("Котов осталось " + Cat.catCount);


            while (rhcp.alive()) {

                rhcp.feed(150.00); // кормим на 150 гр

                System.out.println("Кот рхчп за все время съел " + rhcp.mealCount() + " грамм корма");  // проверка кол-ва еды

                System.out.println("Всего котов создано " + Cat.catCount); // вызываем счетчик котов при помощи слова Cat

            }
        }
            private static Cat getKitten(){ // метод создания котенка
                return new Cat(1100.00);
            }
        }