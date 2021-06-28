public class Lesson32_Conversion {
    public static void main(String[] args) {


        Dog dog = new Dog();
        //Upcasting - восходящее преобразование; происходит неявно
        Animal animal = dog;

        //Downcasting - нисходящее преобразование; yt dctulf ,tpjgfcty
        Dog dog2 = (Dog) animal;
        dog2.bark();

        Animal a1 = new Animal();
        Dog dog1 = (Dog) a1;
        dog1.bark();// class Animal cannot be cast to class Dog



    }
}
