import java.util.ArrayList;
import java.util.List;

public class Lesson34_Wildcards {
    public static void main(String[] args) {
        List<Lesson34_Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Lesson34_Animal(11));
        listOfAnimals.add(new Lesson34_Animal(22));

        List<Lesson34_Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Lesson34_Dog());
        listOfDogs.add(new Lesson34_Dog());

        test(listOfAnimals);
        test(listOfDogs); // в таком случае полиморфизм не работает

    }
//для того, чтобы все прошло, используем Wildcard

    //private static void test(List<Lesson34_Animal> list){
    private static void test(List<? extends Lesson34_Animal> list)   {
        //? - Wildcard распространяется на классы, унаследованные от Animal
       // если extends заменить на super, то можно будет увидеть только классы,
        //которые находятся выше Animal в иерархии наследования

        for(Lesson34_Animal animal : list){
            //System.out.println(animal);
            animal.eat();
        }
    }
}
