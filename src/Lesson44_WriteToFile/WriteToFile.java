package Lesson44_WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");

        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("Test row 1");
        printWriter.println("Test row 2");

        printWriter.close();
    }
}
