//конструктор - метод, который вызывается при создании нового объекта
//у конструктора нет типа возвращаемого значения
//имя конструктора всегда совпадает с именем класса

public class Lesson20_Constructors {
    public static void main(String[] args) {
        Human1 human1 = new Human1();
        //Human1 human1 = new Human1("Bobby");
        //Human1 human1 = new Human1("Bobby", 45);
        }
}
    class Human1 {
        private String name;
        private int age;

    public Human1(){
        this.name = "Noname";
        this.age = 0;
        System.out.println("Hello from the first costructor!");
    }

    public Human1(String name){
        System.out.println("Hello from the second costructor!");
        this.name = name;
    }

        public Human1(String name, int age) {
            System.out.println("Hello from the third costructor!");
            this.name = name;
            this.age = age;
        }


    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }
}

