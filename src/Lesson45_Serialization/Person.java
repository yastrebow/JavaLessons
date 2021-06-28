package Lesson45_Serialization;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial //это необходимо для того, чтобы помечать состояние класса
    //если с классом проводились какие-то работы; serialVersionUID надо будет перегенерировать при использовании измененного класса
    private static final long serialVersionUID = -2275664831314318974L; //обязательно реализовывать интерфейс Serializable

    private transient int id;
    private String name;
    //ключевое слово transient указывает на поле, которое мы не хотим сериализовывать

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return id + " : " + name;
    }
}
