public class ShellSort {
    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        sort(array);

        // System.out.print("Sorted Array: ");
        PrintArray(array);
    }

    private static void sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
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
