//объекты в Java делятся на mutable и immutable
//StringBuilder при конкатенации строк не оставляет "старые" строки
//объекты класса StringBuilder - mutable
import java.util.Locale;

public class Lesson23_StringBuilder {
    public static void main(String[] args) {
        //     String str1 = "Hello, Dolly";// will be delete by Garbage Collector
        //     //str1.toUpperCase(); //при выводе ничего не изменится - строку мы не изменили
        //     str1 = str1.toUpperCase(); // Ok. Because -> new object of class String
        //     System.out.println(str1);
        // }

        //String s1 = "Hello ";
        //String s2 = "My ";
        //String s3 = "Friend!";
        //String stringAll = s1+s2+s3;
        //System.out.println(stringAll);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" My").append(" Friend!");
        System.out.println(sb.toString());

    }
}
