public class InsertionSortRecursion {
    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        sort(array);

        // System.out.print("Sorted Array: ");
        PrintArray(array);
    }

    private static void sort(int[] array) {
        // for (int FirstUnsortedIndex = 0; FirstUnsortedIndex < array.length; FirstUnsortedIndex++) {
        //     int newElement = array[FirstUnsortedIndex];
        //     int i;
        //     for (i = FirstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
        //         array[i] = array[i - 1];
        //     }
        //     array[i] = newElement;
        // }

        InsertionSort(array, array.length);
    }

    private static void InsertionSort(int[] array, int NumberOfItem) {
        if (NumberOfItem < 2) {
            return;
        }
        InsertionSort(array, NumberOfItem - 1);

        int newElement = array[NumberOfItem - 1];
        int i;
        for (i = NumberOfItem - 1; i > 0 && array[i - 1] > newElement; i--) {
            array[i] = array[i - 1];
        }
        array[i] = newElement;


        // System.out.println("Result of call when numItems = " + NumberOfItem);
        // for (i = 0; i < array.length; i++) {
        //     System.out.print(array[i]);
        //     System.out.print(", ");
        // }
        // System.out.println("");
        // System.out.println("---------------------");


    }

    private static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t\t");
        }
        System.out.println();
    }
}
