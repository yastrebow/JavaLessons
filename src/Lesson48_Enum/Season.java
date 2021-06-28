package Lesson48_Enum;

public enum Season {

    SUMMER(+30), WINTER(-15), AUTUMN(+7), SPRING(+15); //это объекты "класса" Season

    private int temperature;

    Season(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }
}
