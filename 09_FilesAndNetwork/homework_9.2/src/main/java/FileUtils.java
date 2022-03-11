import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileUtils {

    public static void copy(File source, File target) throws IOException {
        if (source.isDirectory()) {                     // проверяем папка или нет
            copyDirectory(source, target);      // копируем файл с помощью метода copyDirectory
        } else {
            copyFolder(source.getAbsolutePath(), target.getAbsolutePath());         // если проверку не проходит используем copyFolder
        }
    }

    public static void copyDirectory(File source, File target) throws IOException {
        if (!target.exists()) {                                 // если конечная папка существует
            target.mkdir();                                     // создаем в папке по пути папку
        }

        for (String f : source.list()) {                        // пробегаем по файлам в папке
            copy(new File(source, f), new File(target, f));     // создаем файл в конечном пути с файлами f
        }
    }

    public static void copyFolder(String source, String target) throws IOException {
        try (
                InputStream in = new FileInputStream(source);   // создаем поток входных данных
                OutputStream out = new FileOutputStream(target) // создаем поток данных на выход
        ) {
            byte[] buf = new byte[1024];                        // создаем массив байт
            int length;
            while ((length = in.read(buf)) > 0) {               // пока буферобмена читается записываем данные в папку
                out.write(buf, 0, length);
            }
        }
    }
}
