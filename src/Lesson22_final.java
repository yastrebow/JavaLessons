//final не может изменить своё значение
//final обычно static

public class Lesson22_final {
    public static void main(String[] args) {
    //Test.CONSTANT = 10; - это невозможно; будет ошибка
    final int X = 10;
        System.out.println(X);
       // X = 5; - это невозможно; будет ошибка
    }
}

class Test{
    public static final int CONSTANT = 0;

   //public Test (int CONSTANT){
   //this.CONSTANT = CONSTANT;
   //}
    //public void getCONSTANT(int x){
        //this.CONSTANT = x;
    //}

}
