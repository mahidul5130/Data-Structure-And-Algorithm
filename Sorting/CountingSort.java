public class CountingSort {
    public static void main(String[] args) {

        int[] array = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        sort(array);

        // System.out.print("Sorted Array: ");
        PrintArray(array);
    }

    private static void sort(int[] array) {
        int min = 1;
        int max = 10;
        Counting_Sort(array, min, max);
    }

    private static void Counting_Sort(int[] array, int min, int max) {
        int[] countArray = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]-min]++;
        }
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i-min]>0) {
                array[j++] = i;
                countArray[i-min]--;
            }
        }
    }

    private static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t\t");
        }
        System.out.println();
    }
}
