package Lesson45_Serialization;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        //Person person1 = new Person(1, "Tom");
        //Person person2 = new Person(2, "Bob");
        //созданные объекты, если к ним не обращаться, будут стерты через какое-то время
        //чтобы этого не произошло их надо записать на жесткий диск
        //это и называется сериализацией

        //2. Запишем массив
        Person[] people = {new Person(1, "Tom"), new Person(2, "Bob"), new Person(3, "Larissa")};

        //для записи надо создать объект
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            //используем try with resources вместо:
            //FileOutputStream fos = new FileOutputStream("people.bin");//объект, предназначен для записи байтов
            //ObjectOutputStream oos = new ObjectOutputStream(fos); //предназначен для записи объектов в файл, но ему нужен fos

            //oos.writeObject(person1);
            //oos.writeObject(person2);

            //2 var 1
            //oos.writeInt(people.length);
            //for(Person person : people){
            //    oos.writeObject(person);

                //2 var 2
                oos.writeObject(people);

            //fos.close(); //не забывать закрывать поток
            //закрытие потока можно делать автоматически при помощи try with resources

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
