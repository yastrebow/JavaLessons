public class Incapsulation {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setName("");
        person1.setAge(-5);
        System.out.println("Выводим значение в main-методе: " + person1.getName());
        System.out.println("Выводим значение в main-методе: " + person1.getAge());
        person1.speak();
    }
}
        class Person1 {
        private String name;
        private int age;

        public void setName(String userName){
            if(userName.isEmpty()){
                System.out.println("Введено пустое имя!");
            }
            else {
                name = userName;
            }
        }
        public String getName(){
            return name;
        }

        public void setAge (int userAge){
            if(userAge < 0){
                System.out.println("Возраст должен быть положительным!");
            } else {
                age = userAge;
            }
        }
        public int getAge(){
            return age;
        }

        void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

        int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

        void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ". I am " + age);
        }
    }
        void sayHello() {
        System.out.println("Hello");
    }
}

