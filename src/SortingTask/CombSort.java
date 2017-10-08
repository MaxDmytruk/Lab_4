package SortingTask;

import ArrayTask.Helper;

public class CombSort extends Sort {
    public CombSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        int[] sortedArray = Helper.cloneArray(array);

        int length = sortedArray.length;
        int gap = length;
        boolean isSwapped = true;

        while (gap != 1 || isSwapped == true) {
            gap = getNextGap(gap);
            isSwapped = false;
            for (int i = 0; i < length - gap; i++) {
                if (sortedArray[i] > sortedArray[i + gap]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + gap];
                    sortedArray[i + gap] = temp;
                    isSwapped = true;
                }
            }
        }
        return sortedArray;
    }

    private static int getNextGap(int gap) {
        gap = (gap * 10) / 13;
        if (gap < 1)
            return 1;
        return gap;
    }
}
