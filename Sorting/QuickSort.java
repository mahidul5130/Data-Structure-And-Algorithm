public class QuickSort {
    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        sort(array);

        // System.out.print("Sorted Array: ");
        PrintArray(array);
    }

    private static void sort(int[] array) {
        int start = 0;
        int end = array.length;
        Quick_Sort(array, start, end);
    }

    private static void Quick_Sort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(array, start, end);
        Quick_Sort(array, start, pivotIndex);
        Quick_Sort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        // This is using the first element as pivot
        int pivot = array[start];
        int i = start;
        int j = end;

        // Note: Empty Loop Body
        while (i < j) {
            // Note: empty loop body
            while (i < j && array[--j] >= pivot);
            if (i < j) {
                array[i] = array[j];
            }
            // Note: empty loop body
            while (i < j && array[++i] <= pivot);
            if (i < j) {
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }

    private static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t\t");
        }
        System.out.println();
    }
}
