//import java.net.URI;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {
    public static final String PATH_TO_LIST = "C:\\Users\\katya\\Desktop\\movementList.csv";

    public static void main(String[] args)
    {
        Movements movements = new Movements(PATH_TO_LIST);

        System.out.println(movements.getExpenseSum());
    }
}
