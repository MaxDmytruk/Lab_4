package SortingTask;

import ArrayTask.Helper;

public class CoctailSort extends Sort {
    public CoctailSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        int[] sortedArray = Helper.cloneArray(array);
        boolean isSwaped = true;
        int start = 0;
        int end = sortedArray.length;

        while (isSwaped) {
            isSwaped = false;
            for (int i = start; i < end - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    isSwaped = true;
                }
            }
            if (isSwaped = false)
                break;
            isSwaped = false;
            end--;
            for (int i = end - 1; i >= start; i--) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    isSwaped = true;
                }
            }
            start++;
        }
        return sortedArray;
    }
}
