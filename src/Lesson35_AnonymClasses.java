public class Lesson35_AnonymClasses {

    interface AbleToEat {
        public void eat();
    }

    public static class Test {
        public static void main(String[] args) {
            AbleToEat ableToEat = new AbleToEat() { //объект этого класса создали только на один раз
                @Override
                public void eat() {
                    System.out.println("Someone is eating...");
                }
            };
            ableToEat.eat();
        }
    }
}
