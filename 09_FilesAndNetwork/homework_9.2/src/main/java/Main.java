import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (;;){
            try{
                System.out.println("Введите путь к папке которую хотите копировать: ");

                Scanner scanner = new Scanner(System.in);
                String path = scanner.nextLine();
                File sourceDirectory = new File(path);

                System.out.println("Введите путь к папке в которую копируем: ");
                String path1 = scanner.nextLine();
                File destinationDirectory = new File(path1);

                FileUtils.copy(sourceDirectory, destinationDirectory);


            }catch (NullPointerException | IOException ex){
                ex.printStackTrace();
            }
            System.out.println("Папка скопирована");
        }
    }
}