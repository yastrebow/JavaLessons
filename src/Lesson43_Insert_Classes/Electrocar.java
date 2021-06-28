package Lesson43_Insert_Classes;

public class Electrocar {
    private int id;

    /*вложенные классы в Java. 3 типа:
1. Нестатический вложенный класс. Обычно - private.
    Относятся к объекту. Имеют доступ к полям объекта (id)
    Нужны для описания логики подобъектов.

2.  Статический вложенный класс. Обычно - public.
    Не имеет доступа к полям объекта. Нужен для группировки классов (Electrocar and Battery)
    Нужны для использования извне.

3. Вложенные классы метода.
    Имеют доступы и к нестатическим полям класса и к переменным метода (к константам!!!)
    Похожи на анонимные классы
 */
    //1
    private class Engine {
        public void startEngine(){
            System.out.println("Engine " + id + " is starting");
        }
    }

    //2.
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Engine engine = new Engine();
        engine.startEngine();

        final int x = 1;
        //3.
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }
        SomeClass someClass = new SomeClass(); //пример использования
        test(someClass); //пример использования

        System.out.println("Electrocar " + id + " ie starting...");
    }
    private void test(Object obj){ //пример использования

    }
}
