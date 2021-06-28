//static - переменные и методы классов
// обращаться к статик переменным из нестатик методов мы не можем
//потому что переменные метода у каждого объекта свои

public class Lesson21_static {
    public static void main(String[] args) {
    Human21 h211 = new Human21("Bob", 27);
    Human21 h212 = new Human21("Tom", 37);
        h211.printNumberOfPeople();
        h212.printNumberOfPeople();

    Human21 h213 = new Human21("Nick", 88);
   // Human21.description = "Nick"; //обращаемся к статической переменной
    //Human21.getDescription(); // вызываем статический метод другого класса
    //Human21 h21 = new Human21("Bobby", 37);
       //h211.getAllFields();
       //h212.getAllFields();
       //Human21.description = "Not Nick";//если мы поменяем статик переменную, она поменяется для всех лбъектов класса
       //h211.getAllFields();
       //h212.getAllFields();
        h211.printNumberOfPeople();
        h212.printNumberOfPeople();
        h213.printNumberOfPeople();
    }
}
class Human21 {
    private String name;
    private int age;

    private static int countPeople;// переменная одна для всех объектов
   //public static String description;

    public Human21(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    //public static void getDescription(){
      //  System.out.println(description);
    //}

    //public void getAllFields(){
    //    System.out.println(name + ", " + age + ", " + description);
    //}
    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }
}
