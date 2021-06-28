package Lesson48_Enum;
//Enum
public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягуха");
    //new DOG("собака")

    private String translation;

    Animal(String translation){
    this.translation = translation;
}
public String getTranslation() {
        return translation;
}
public String toString() {
        return "Перевод на русский язык: " + translation;
}

}
