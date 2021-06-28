public class Break_Continue {
    public static void main(String[] args) {
        //nt i = 0;
        //while (true) {
        //if(i==15){
        //break;
        //}
        //    System.out.println(i);
        //    i++;
        //}
        //System.out.println("The End");
        //}

        for (int j = 0; j <= 15; j++) {
            if (j % 2 == 0) {
                continue; //инкрементирует счетчик
            }
            System.out.println(j + " - это нечетное число!");
        }
    }
}
