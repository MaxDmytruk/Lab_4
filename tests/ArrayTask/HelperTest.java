package ArrayTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {
    @Test
    void cloneArray() {
        int[] arrayToClone = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int[] clonedArray = Helper.cloneArray(arrayToClone);
        assertArrayEquals(arrayToClone, clonedArray);
    }

    @Test
    void generateArray() {
        int[] zeroArray = new int[]{0, 0, 0, 0};
        int[] generatedArray = Helper.generateArray(zeroArray.length);
        int zeroElements = 0;

        for (int i = 0; i < zeroArray.length; i++) {
            if(generatedArray[i] == 0)
                zeroElements++;
        }

        assertTrue(zeroElements != generatedArray.length);
    }

}