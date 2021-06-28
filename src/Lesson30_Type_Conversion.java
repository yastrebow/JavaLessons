public class Lesson30_Type_Conversion {
    public static void main(String[] args) {
         byte b = 123;
         short s = 123;
         int i = 123;
         long l = 12312L;
         float f = 123.23f;
         double d = 123.23;

         //long into int
         long l1 = i;//неявное приведение типов
         //int i1 = l; // mistake, because long > int
         int i1 = (int) l1; //явное приведение
        System.out.println(i1);

        double d1 = i;
        int i2 = (int)d;
        System.out.println(d1);
        System.out.println(i2);

        byte b1 = (byte)129;
        System.out.println(b1);

        //классы-обертки, используются, когда нужен какой-то метод для работы с примитивами
        //Double, Float, Long, Integer, Short, Byte, Character, Boolean

        int x = 1;
        Integer x1 = new Integer(123);
        Integer.parseInt("123");

        //автоупаковка/автораспаковка

        Integer x2 = 123; //автоупаковка
        int y = x2;//автораспаковка
    }
}
