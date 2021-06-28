//Все классы в Java унаследованы от класса Object

public class Lesson24_class_Object_method_toString {
    public static void main(String[] args) {
    Human123 human123 = new Human123("Bobby", 45);
    human123.toString(); //метод toString возвращает hashcode для объекта
        System.out.println(human123);//метод toString вызывается неявным образом
    }
}
class Human123 {
    private String name;
    private int age;

    public Human123(String name, int age) {
        this.age = age;
        this.name = name;
    }
    //чтобы вывод (sout) был другим, надо переопределить метод
    public String toString(){
        return name+" "+age;
    }
}