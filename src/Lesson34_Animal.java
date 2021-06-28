public class Lesson34_Animal {
    private int id;

    public Lesson34_Animal() {

    }
    public Lesson34_Animal(int id) {
        this.id = id;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public String toString(){
        return String.valueOf(id);
    }
}
