public class Arrays {
    public static void main(String[] args) {
        int number = 10; // "коробка" [10]
        int[] numbers = new int[5]; //numbers -> [array]
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i * 10;

            for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println(); // разделяем два вывода пустой строкой
            int[] numbers1 = {11, 15, 5, 13, 26};
        for(int i = 0; i<numbers.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}
