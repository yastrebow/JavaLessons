public class Lesson19_this {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(35);
        human1.setName("Jack");
        human1.getInfo();
    }
}
    class Human{
        String name;
        int age;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name; //this вызывает объект внутри класса
        //в данном случае обращаемся к переменным объекта person1
            // т.е. this.name == person1.name
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

    public void getInfo(){
        System.out.println(name + ", " + age);
    }
}
