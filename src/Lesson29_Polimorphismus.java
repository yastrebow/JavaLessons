public class Lesson29_Polimorphismus {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
       // Animal animal1 = new Dog();
        //animal1.bark(); - do not working
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

        animal.eat();
        dog.eat(); //позднее связывание: в потомке есть переопределенный метод eat, поэтому вызывается он
       // animal1.eat();
        dog.bark();
    }
    //возможность передачи в метод разных типов

    public static void test(Animal animal) {
        animal.eat();
    }
}
