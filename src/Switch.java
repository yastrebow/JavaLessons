import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        //int age = scanner.nextInt();
        //    switch (age) {
        //        case 0 :
        //            System.out.println("You was born!");
        //            break;
        //        case 7 :
        //            System.out.println("Welcome to school, son!");
        //            break;
        //        case 25 :
        //            System.out.println("It's time to wedding!");
        //            break;
        //        case 65 :
        //            System.out.println("Hello, old motherfucker!");
        //            break;
        //        default:
        //            System.out.println("WTF???");

        //      }
        String age = scanner.nextLine();
        switch (age) {
            case "zero":
                System.out.println("You was born!");
                break;
            case "seven":
                System.out.println("Welcome to school, son!");
                break;
            case "twenty eight":
                System.out.println("It's time to wedding!");
                break;
            case "sixty five":
                System.out.println("Hello, old motherfucker!");
                break;
            default:
                System.out.println("WTF???");
        }
    }
}
