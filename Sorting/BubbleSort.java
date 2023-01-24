public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};
        
        sort(array);

        // System.out.print("Sorted Array: ");
        PrintArray(array);
    }


    private static void sort(int[] array) {
        for (int LastUnsortedIndex = array.length - 1; LastUnsortedIndex > 0; LastUnsortedIndex--) {
            for (int i = 0; i < LastUnsortedIndex; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i +1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "\t\t");
        }
        System.out.println();
    }
}