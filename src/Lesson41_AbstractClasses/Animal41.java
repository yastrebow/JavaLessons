package Lesson41_AbstractClasses;

public abstract class Animal41 {
    public void eat() {
        System.out.println("I am eating...");
    }
    public abstract void makeSound();
    //нет реализации.
    //Все наши животные едят одинаково
    //но все издают разные звуки
}
