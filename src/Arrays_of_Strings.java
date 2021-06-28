public class Arrays_of_Strings {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "hello";
        strings[1] = "bye";
        strings[2] = "java";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        System.out.println();
        for(int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string : strings){
            System.out.println(string);
        }

        int[] num1 = {1, 2, 3};
        int sum = 0;
        for(int num : num1){
            sum = sum + num;
        }
            System.out.println();
            System.out.println(sum);

            int value = 0;
            String s = "Karrrrapuzius";

        }
}
