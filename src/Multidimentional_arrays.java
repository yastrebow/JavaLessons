public class Multidimentional_arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[1]);

        System.out.println();
        int[][] matrix = {{1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}};
        System.out.println(matrix[1][1]);//5
        System.out.println(matrix[0][1]);//2
        System.out.println(matrix[2][3]);//9

        String[][] strings = new String[2][3];
        System.out.println();
        System.out.println(strings[1][2]);

        //выведем массив в виде таблицы
        int[][] matrix1 = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
