import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
//из одного метода можно выбрасывать несколько разных исключений
    public static void run() throws IOException, ParseException, IllegalArgumentException {


    }
}
