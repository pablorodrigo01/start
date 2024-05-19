public class RecursiveInsertionSort {

    public static void insertionSort(int[] array) {
        insertionSort(array, 0);
    }

    private static void insertionSort(int[] array, int start) {
        if (start < array.length - 1) {
            int minIndex = findMinIndex(array, start);
            swap(array, start, minIndex);
            insertionSort(array, start + 1);
        }
    }

    private static int findMinIndex(int[] array, int start) {
        int minIndex = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
