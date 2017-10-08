package SortingTask;

import ArrayTask.Helper;

public class BubbleSort extends Sort {

    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        int[] sortedArray = Helper.cloneArray(array);

        for (int j = 0; j < sortedArray.length; j++) {
            boolean hasChanges = false;
            for (int i = 1; i < sortedArray.length; i++) {
                if (sortedArray[i - 1] > sortedArray[i]) {
                    sortedArray[i] += sortedArray[i - 1];
                    sortedArray[i - 1] = sortedArray[i] - sortedArray[i - 1];
                    sortedArray[i] -= sortedArray[i - 1];
                    hasChanges = true;
                }
            }
            if (!hasChanges)
                break;
        }
        return sortedArray;
    }
}
