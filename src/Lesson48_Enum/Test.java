package Lesson48_Enum;

import com.sun.source.tree.CompoundAssignmentTree;

import javax.crypto.spec.PSource;

public class Test {
    //old method of enum
    //public static final int DOG = 0;
    //public static final int CAT = 1;
    //private static final int FROG = 2;

    public static void main(String[] args) {
        //    //old method of enum
        //    int animal = DOG;

        //    switch (animal) {
        //        case DOG:
        //            System.out.println("It's a dog");
        //            break;
        //        case CAT:
        //            System.out.println("It's a cat");
        //            break;
        //        case FROG:
        //            System.out.println("It's a frog");
        //            break;
        //        default:
        //            System.out.println("It isn't an animal");
        //    }
        //с использованием Enum'a
        Animal animal2 = Animal.CAT;
        System.out.println(animal2);

        //     switch (animal2) {
        //         case DOG:
        //             System.out.println("It's a dog");
        //             break;
        //         case CAT:
        //             System.out.println("It's a cat");
        //             break;
        //         case FROG:
        //             System.out.println("It's a frog");
        //             break;
        //         default:
        //             System.out.println("It isn't an animal");
        //}

        Season season = Season.SUMMER;
        System.out.println(season.getTemperature());
        //Object -> Enum -> Season

        //  System.out.println(season instanceof Enum);
        //  System.out.println(season.getClass().getClass());

        //   switch (season) {
        //       case SUMMER:
        //           System.out.println("It's warm outside");
        //           break;
        //       case WINTER:
        //           System.out.println("It's cold outside");
        //           break;
        // }

        //полезные методы:
        System.out.println(season.name());
        System.out.println(animal2.name());

        Animal dog = Animal.valueOf("DOG");
        System.out.println(dog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
    }
}

