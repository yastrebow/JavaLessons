import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//обработка исключений

public class Exceptions1 {
    public static void main(String[] args) {
//        File file = new File("aobl");
//
//        try{
//            Scanner scanner = new Scanner(file);
//            System.out.println("After Scanner");//don't work
//
//        } catch (FileNotFoundException e) {
//            //e.printStackTrace(); //выводит сообщение об ошибке
//            System.out.println("Файл не найден");
//        }
//        System.out.println("After try-catch block application is working");
        try {
            readFile();//обработка исключения делегируется по иерархии вверх
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }

    }

    public static void readFile() throws FileNotFoundException {
            File file = new File("Test1");
            Scanner scanner = new Scanner(file);
        }
}
