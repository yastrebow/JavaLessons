public class Lesson23_string_format {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Hello again");

        //без переноса строки
        System.out.print("Hello");
        System.out.println("Hello again");

        //вставка в строку
        System.out.printf("This is a string, %s", "NICE ");
        System.out.println();
        System.out.printf("This is a string, %d", 111);
        System.out.println();
        System.out.printf("%f This is a %s string, %d", 3.14159, "NICE", 111);

        //форматирование строки
        System.out.println();
        System.out.printf("String %10d \n", 555); //%10 - задает ширину числа
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 5555555);
        System.out.printf("String %10d \n", 555555555);

        System.out.println();
        System.out.printf("String %-10d \n", 555); //%-10 - числа отформатированы по левому краю
        System.out.printf("String %-10d \n", 5);
        System.out.printf("String %-10d \n", 5555555);
        System.out.printf("String %-10d \n", 555555555);

        System.out.println();
        System.out.printf("String %.3f \n", 5.555); //%10 - задает ширину числа
        System.out.printf("String %.3f \n", 55.55);
        System.out.printf("String %.3f \n", 555.5555);
        System.out.printf("String %.3f \n", 5555.55555);
    }
}
