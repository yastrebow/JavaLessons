package Lesson41_AbstractClasses;

import Interfaces.Animal;

//класс Animal не является сущностью (некое абстрактное животное)
//поэтому этот класс нужно сделать абстрактным
//его объекты не должны быть созданы, классы наследников могут быть созданы
//абстрактный класс д.б. наследован и его абстрактные методы д.б. реализованы

//интерфейс - контракт, который показывает, что класс умеет (able)
//абстр. класс показывает, чем класс является

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
       //Animal41 animal = new Animal41();

        cat.makeSound();
        dog.makeSound();
        cat.eat();
        dog.eat();
    }
}
