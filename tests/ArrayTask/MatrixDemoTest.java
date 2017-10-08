package ArrayTask;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MatrixDemoTest {
    private static int MATRIX_ORDER = 4;
    private MatrixDemo target = new MatrixDemo(MATRIX_ORDER);

    @Test
    void getMatrix() {
        MatrixDemo matrixDemo = new MatrixDemo(MATRIX_ORDER);
        for (int[] row : matrixDemo.getMatrix()){
            assertArrayEquals(new int[MATRIX_ORDER], row);
        }
    }

    @Test
    void getMatrixOrder() {
        MatrixDemo matrixDemo = new MatrixDemo(MATRIX_ORDER);
        assertEquals(MATRIX_ORDER, matrixDemo.getMatrixOrder());
    }

    @Test
    void createMonotonousMatrix() {
        int[][] resultMonotonousMatrix = target.createMonotonousMatrix(3);
        for (int[] row: resultMonotonousMatrix) {
            for(int i = 1; i < row.length - 1; i++){
                if(row[i-1] >= row[i]){
                    assertTrue(row[i] >= row[i+1]);
                }
                else if(row[i-1] < row[i]){
                    assertTrue(row[i] < row[i+1]);
                }
            }
        }
    }

    @Test
    void getAllEvenRow() {
        assertArrayEquals(new int[]{0}, target.getAllEvenRow(new int[][] {{1, 1, 1}, {1, 2, 3}}));
        assertArrayEquals(new int[]{}, target.getAllEvenRow(new int[][] {{1, 1, 4}, {}}));
        assertArrayEquals(new int[]{}, target.getAllEvenRow(new int[][] {null}));
    }

    @Test
    void intListToArray() {
        int[] resultOneTwoThree = target.intListToArray(new ArrayList<Integer>(){{add(1); add(2); add(3);}});
        int[] resultEmpty = target.intListToArray(new ArrayList<Integer>(){});
        int[] resultEmptyNull = target.intListToArray(null);

        assertArrayEquals(new int[]{}, resultEmpty);
        assertArrayEquals(new int[]{}, resultEmptyNull);
        assertArrayEquals(new int[]{1, 2, 3}, resultOneTwoThree);
    }

    @Test
    void isAllItemsEven() {
        assertTrue(target.isAllItemsEven(new int[]{1}));
        assertTrue(target.isAllItemsEven(new int[]{1, 1, 1}));
        assertFalse(target.isAllItemsEven(new int[]{1, 5, 1}));
        assertFalse(target.isAllItemsEven(null));
        assertFalse(target.isAllItemsEven(new int[]{}));
    }

    @Test
    void getMonotonuosRows() {
        int[] resultOneTwoThree = target.getMonotonuosRows(new int[][]{{1,0,4}, {1,2,3}});
        int[] resultEmpty = target.getMonotonuosRows(new int[][]{{}, {1,0,5}});
        int[] resultEmptyNull = target.getMonotonuosRows(null);

        assertArrayEquals(new int[]{1}, resultOneTwoThree);
        assertArrayEquals(new int[]{}, resultEmpty);
        assertArrayEquals(new int[]{}, resultEmptyNull);
    }

    @Test
    void isMonotonousSequence() {
        assertTrue(target.isMonotonousSequence(new int[]{1,4,7,8}));
        assertTrue(target.isMonotonousSequence(new int[]{1}));
        assertFalse(target.isMonotonousSequence(null));
        assertFalse(target.isMonotonousSequence(new int[]{}));
    }

    @Test
    void getSumOfRow() {
        assertEquals(6, target.getSumOfRow(new int[]{1, 2, 3}));
        assertEquals(0, target.getSumOfRow(null));
        assertEquals(0, target.getSumOfRow(new int[]{}));
        assertEquals(-3, target.getSumOfRow(new int[]{-5, 2, 0}));
    }

    @Test
    void getMaxInRow() {
        assertEquals(5, target.getMaxInRow(new int[]{1,2,3,4,5}));
        assertEquals(-99, target.getMaxInRow(new int[]{}));
        assertEquals(-99, target.getMaxInRow(null));
    }
}