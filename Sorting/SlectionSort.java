public class SlectionSort {
    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};
        
        sort(array);

        // System.out.print("Sorted Array: ");
        PrintArray(array);
    }


    private static void sort(int[] array) {
        for (int LastUnsortedIndex = array.length - 1; LastUnsortedIndex > 0; LastUnsortedIndex--) {
            
            int largest = 0;

            for (int i = 1; i <= LastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }

            swap(array, LastUnsortedIndex, largest);
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

