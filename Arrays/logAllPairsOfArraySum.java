public class logAllPairsOfArraySum {
    public static void main(String[] args) {
        int[] array = new int[5];

        array[0] = 15;
        array[1] = 19;
        array[2] = 21;
        array[3] = 11;
        array[4] = 10;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i]+array[j]);
            }
        }
    }
}
