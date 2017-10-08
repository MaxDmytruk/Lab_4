package SortingTask;

public class QuickSort extends Sort {

    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        return quickSort(array, 0, array.length - 1);
    }

    private static int[] quickSort(int[] array, int left, int right) {
        int index = getMdeiana(array, left, right);
        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }
        if (index < right) {
            quickSort(array, index, right);
        }
        return array;
    }

    private static int getMdeiana(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int tmp;
        int pivot = array[(left + right) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
}
