package Lesson42_equals_StringPool;

public class Test {
    public static void main(String[] args) {
        String string1 = "Hello"; // string1 -> {"Hello"}
        String string2 = "Hello"; //string2 указывает на тот же объект, что и string1 (String Pool)
        //если мы создаем объекты сами (String string = new String ("Hello");), объекты будут разными => false

        System.out.println(string1.equals(string2)); //true

        //сравнение примитивов
        int x = 1;
        int y = 1;
        System.out.println(x == y); //true

        //сравнение объектов
        Animal42 animal1 = new Animal42(1);
        Animal42 animal2 = new Animal42(1);
        //animal1 -> {1}
        //animal2 -> {1}

        System.out.println(animal1 == animal2); //false; сравниваем указатели
        System.out.println(animal1.equals(animal2)); //false (до переопределения equals); сравниваем объекты как ссылки
                                                    //true (после переопределения); сравниваем id (примитивы)


        // == сравнивает ссылки на объекты, а не сами объекты
        //equals сравнивает сущности
    }
}

    class Animal42 {
        private int id;

        public Animal42 (int id) { //конструктор метода
            this.id = id;
        }
//переопределяем метод equals
        public boolean equals(Object obj) {
            Animal42 otherAnimal = (Animal42) obj; //Downcasting
            return this.id == otherAnimal.id;
        }
        }

