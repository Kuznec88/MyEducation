import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("Введите путь до папки:");

            Scanner scanner = new Scanner(System.in);
            File folder = new File(scanner.nextLine());

            try {
                if (folder.isDirectory()) {

                    File file = new File(String.valueOf(FileUtils.calculateFolderSize(folder.getPath())));
                    System.out.println("Размер папки: " + humanReadableByteCountBin(file.length(), folder.getPath()));

                } else if (!folder.isDirectory())
                    System.out.println("Неверный путь");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static String humanReadableByteCountBin(long bytes, String folder) {


        long size = FileUtils.calculateFolderSize(folder);

        String[] units = new String[]{"B", "KB", "MB", "GB", "TB"};
        int unitIndex = (int) (Math.log10(size) / 3);
        double unitValue = 1 << (unitIndex * 10);

        String readableSize = new DecimalFormat("#,##0.#")
                .format(size / unitValue) + " "
                + units[unitIndex];

        return readableSize;
    }
}