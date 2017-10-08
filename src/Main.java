import ArrayTask.ArrayDemo;
import ArrayTask.Helper;
import ArrayTask.MatrixDemo;
import SortingTask.*;

public class Main {
    private static final int ARRAY_TO_SORT_LENGTH = 150;

    public static void main(String[] args){
        int[][] sortedArrays = new int[5][ARRAY_TO_SORT_LENGTH];
        int[] arrayToSort = Helper.generateArray(ARRAY_TO_SORT_LENGTH);

        System.out.print("Enter array length: ");
        ArrayDemo arrayDemo = new ArrayDemo(Helper.getIntInput());
        arrayDemo.init();

        System.out.print("Enter matrix order: ");
        MatrixDemo matrixDemo = new MatrixDemo(Helper.getIntInput());
        matrixDemo.init();

        Sort[] arraySortingMethods = new Sort[]{
            new BubbleSort(arrayToSort),
            new QuickSort(arrayToSort),
            new HeapSort(arrayToSort),
            new CombSort(arrayToSort),
            new CoctailSort(arrayToSort)
        };

        System.out.print("Array to sort: ");
        Helper.showArray(arrayToSort);
        for (int i = 0; i < arraySortingMethods.length; i++){
            sortedArrays[i] = arraySortingMethods[i].sort();
        }

        for (int[] arrayToShow : sortedArrays){
            System.out.println();
            Helper.showArray(arrayToShow);
        }
    }
}
