//Generics -

import java.util.ArrayList;
import java.util.List;

public class Lessons33_Generics {
    public static void main(String[] args) {
        //до Java5
        List animals = new ArrayList();
        Animal1 ourAnimal = new Animal1();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(2);
        System.out.println(animal);

        //С появлением Generics (параметризация класса)
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        //animals2.add(ourAnimal); - error

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        //Java 7
        List<String> animals3 = new ArrayList<>();
        animals3.add("cat");
        animals3.add("dog");
        animals3.add("frog");

        String animal3 = animals3.get(0);
        System.out.println(animal3);
    }
}
class Animal1{

}
