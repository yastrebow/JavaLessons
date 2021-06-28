public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        //person1.name = "Tom";// ***
        //person1.age = 43;
        person1.setNameAndAge("Tom", 43);

        // System.out.println("My name is " + person1.name + ". I am " + person1.age);
        //person1.sayHello();
        //person1.speak();
       // int year1 = person1.calculateYearsToRetirement();


        String s1 = "Bob";
        Person person2 = new Person();
       //person2.name = "Bob";
       //person2.age = 20;
        // System.out.println("My name is " + person2.name + ". I am " + person2.age);
        //person2.sayHello();
        //person2.speak();
        //int year2 = person2.calculateYearsToRetirement();
        person2.setNameAndAge(s1, 20);

        person1.speak();
        person2.speak();

        //System.out.println();
        //System.out.println("Первому человеку до пенсии: " + year1 + " лет");
        //System.out.println("Второму человеку до пенсии: " + year2 + " лет");
    }
}
    class Person {
        /*у класса м.б.
        1. данные (поля)
        2. действия, к-рые он м. совершать (методы)*/
        String name;
        int age;

        void setName(String username){ //метод идентичен строчке ***
        name = username;
        }

        void setNameAndAge(String username, int userage){
            name = username;
            age = userage;
        }

        int calculateYearsToRetirement() {
            int years = 65 - age;
           return years;
        }

        void speak() { //void - пустота, ничто. Метод не возвращает ничего
            for (int i = 0; i < 3; i++) {
                System.out.println("My name is " + name + ". I am " + age);
            }
        }
        void sayHello() {
            System.out.println("Hello");
        }
}
