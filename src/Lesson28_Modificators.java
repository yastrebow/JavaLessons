//public - доступ из любого класса
//protected - в рамках пакета + классы-наследники
//default - в рамках пакета
//private - только из своего класса

//class - not private or protected

public class Lesson28_Modificators {
    public int id;

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe";
    }
    private void tecnicalMethod(){
    }

}
