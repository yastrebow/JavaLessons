import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        //Checked Exception (Compile time exception) исключительные случаи в работе программы
        //надо обрабатывать

        File file = new File("Test1");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Alarm!!!");
        }
        //Unchecked Exception (Runtime exception) - ошибки в работе программы
        //надо устранять

        //int a = 1 / 0;

        //String name = null;
        //name.length();

        int[] arr = new int[2];
        System.out.println(arr[2]);

    }
}
