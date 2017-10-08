package SortingTask;

import ArrayTask.Helper;

public class HeapSort extends Sort {
    public HeapSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        int[] sortedHeap = array;
        while (sortedHeap[0] > 0) {
            int temp = sortedHeap[1];
            sortedHeap[1] = sortedHeap[sortedHeap[0]];
            sortedHeap[sortedHeap[0]] = temp;

            for (int i = 1; i < sortedHeap[0]; i++) {
                int index = i;

                while (sortedHeap[index / 2] < sortedHeap[index] && (index / 2) != 0) {
                    int temp2 = sortedHeap[index / 2];
                    sortedHeap[index / 2] = sortedHeap[index];
                    sortedHeap[index] = temp2;
                    index /= 2;
                }
            }
            sortedHeap[0]--;
        }
        return sortedHeap;
    }

    private static int[] makeHeap(int[] array){
        int[] heapedArray = Helper.cloneArray(array);
        int index;
        for (int i = 1; i < heapedArray.length; i++){
            heapedArray[0] ++;
            index = i;

            while(heapedArray[index / 2] < heapedArray[index] && (index / 2) != 0){
                int temp = heapedArray[index / 2];
                heapedArray[index / 2] = heapedArray[index];
                heapedArray[index] = temp;
                index /= 2;
            }
        }
        return heapedArray;
    }
}
