package SortingTask;

import static org.junit.jupiter.api.Assertions.*;

public class TestSortHelper {
    public static void isSorted(int[] array){
        for (int i = 1; i < array.length; i++){
            assertTrue(array[i-1] <= array[i]);
        }
    }
}
