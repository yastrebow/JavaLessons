package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(11);
        Person person1 = new Person("Jack");
        outputInfo(animal1);
        outputInfo(person1);

        //animal1.sleep();
        //person1.sayHello();
//
        //animal1.showInfo();
        //person1.showInfo();

        //ниже - полиморфизм
        Info info1 = new Animal(123);
        Info info2 = new Person("Booooobs");
        info1.showInfo();
        info2.showInfo();

        outputInfo(info1);
        outputInfo(info2);
    }
    public static void outputInfo(Info info){
        info.showInfo(); //этот метод может действовать на любом из объектов,
        //класс которых реализует интерфейс Info
    }
}
