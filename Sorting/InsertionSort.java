public class InsertionSort {
    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        sort(array);

        // System.out.print("Sorted Array: ");
        PrintArray(array);
    }

    private static void sort(int[] array) {
        for (int FirstUnsortedIndex = 0; FirstUnsortedIndex < array.length; FirstUnsortedIndex++) {
            int newElement = array[FirstUnsortedIndex];
            int i;
            for (i = FirstUnsortedIndex; i > 0 && array[i-1] > newElement; i--) {
                array[i] = array[i-1];
            }
            array[i] = newElement;
        }
    }

    private static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t\t");
        }
        System.out.println();
    }
}
