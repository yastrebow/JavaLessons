package Lesson49_Recoursion;

//Рекурсия - вызов метода внутри себя

public class Test {
    public static void main(String[] args) {
    counter(3);
        System.out.println(factorial(4));
    }
    //counter(3) -> counter(2)(вызов с аргументом 3 в классе main не закончен, ждет выполнения counter(2))
    // -> counter(1) (вызовы с аргументами 3 и 2 в классе main не закончены; ждут соответственно выполнения counter(2) и counter(1))
    // counter(1) ждет выполнения counter(0)
    // -> counter(0) => выход из метода: последовательно counter(1), counter(2), counter(3)

    //вызовы counter(3,2,1,0) ждут в стэке

    private static void counter(int n){
        System.out.println(n);
            if(n == 0){
            return;
}
        counter(n-1); // 3, 2, 1
    }

    // реализуем факториал с помощью рекурсии
    // 4! = 4*3*2*1
    // 15! = 15*14*13*...*1
    // 1! = 1
    // 0! = 1

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

