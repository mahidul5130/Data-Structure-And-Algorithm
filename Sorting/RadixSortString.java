public class RadixSortString {
    public static void main(String[] args) {

        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        sort(stringsArray);

        // System.out.print("Sorted Array: ");
        PrintArray(stringsArray);
    }

    private static void sort(String[] array) {
        int radix = 26;
        int width = 5;
        radixSort(array, radix, width);
    }

    public static void radixSort(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value: input) {
            countArray[getIndex(position, value)]++;
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }

    }

    public static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }

    private static void PrintArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t\t");
        }
        System.out.println();
    }
}
