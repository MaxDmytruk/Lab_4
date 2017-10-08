package SortingTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    private int[] arrayToSort = new int[]{1, 8, 3, 2, 1, 4};
    int[] result;

    Sort[] sortingMethods = new Sort[]{
        new BubbleSort(arrayToSort),
        new QuickSort(arrayToSort),
        new HeapSort(arrayToSort),
        new CombSort(arrayToSort),
        new CoctailSort(arrayToSort)
    };

    @Test
    void getArray() {
        for (Sort method : sortingMethods){
            assertArrayEquals(arrayToSort,method.getArray());
        }
    }

    @Test
    void sort() {
        for (Sort method : sortingMethods) {
            result = method.sort();
            TestSortHelper.isSorted(result);
        }
    }
}