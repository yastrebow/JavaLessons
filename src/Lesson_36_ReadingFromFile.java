import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson_36_ReadingFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        //String separator = File.separator; //Java определяет вид разделителя в зависимости от ОС
        //String path = "C:" + separator + "Users" + separator + "Лара" + separator + "Documents" + separator + "Документы" + separator + "ANDREY" + separator + "Java++";
        //String path = "C:\\Users\\Лара\\Desktop";
        File file = new File("Test1.txt");

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
