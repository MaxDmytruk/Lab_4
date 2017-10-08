package ArrayTask;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDemoTest {
    private static int ARRAY_LENGTH = 5;
    ArrayDemo target = new ArrayDemo(ARRAY_LENGTH);

    @Test
    void getArray() {
        assertArrayEquals(target.getArray(), new int[ARRAY_LENGTH]);
    }

    @Test
    void getArrayLength() {;
        assertEquals(ARRAY_LENGTH, target.getArrayLength());
    }

    @Test
    void getArythmeticMeanOfPaired() {
        double resultTow = target.getArythmeticMeanOfPaired(new int[]{1, 2, 3});
        double resultZero = target.getArythmeticMeanOfPaired(new int[]{1, 1, 1});
        double resultEight = target.getArythmeticMeanOfPaired(new int[]{8, 4, 12});

        assertEquals(8, resultEight);
        assertEquals(0, resultZero);
        assertEquals(2, resultTow);
    }

    @Test
    void isPaired() {
        assertTrue(target.isPaired(11112));
        assertFalse(target.isPaired(1111));
    }

    @Test
    void isMultipleFive() {
        assertTrue(target.isMultipleFive(11110));
        assertTrue(target.isMultipleFive(11115));
        assertFalse(target.isMultipleFive(1111));
    }

    @Test
    void getSumOfMinNumAndDigits() {
        int resultTwo = target.getSumOfMinNumAndDigits(new int[]{1, 2, 3});
        int resultZero = target.getSumOfMinNumAndDigits(new int[]{-5, -8, -3});
        int resultFifteen = target.getSumOfMinNumAndDigits(new int[]{-5, 12, 48, 81});
        int resultZeroEmpty = target.getSumOfMinNumAndDigits(new int[]{});

        assertEquals(2, resultTwo);
        assertEquals(0, resultZero);
        assertEquals(0, resultZeroEmpty);
        assertEquals(15, resultFifteen);
    }

    @Test
    void getMinimumPositive() {
        int resultFive = target.getMinimumPositive(new int[]{-5, 48, 5});
        int resultZero = target.getMinimumPositive(new int[]{-5, -48, -5});
        int resultZeroEmpty = target.getMinimumPositive(new int[]{});
        int resultOne = target.getMinimumPositive(new int[]{1, 1, 1, 1});
    }

    @Test
    void getMinimum() {
        int resultMinusThree = target.getMinimum(new int[]{4, 0, 1, -2, -3, 5});
        int resultThree = target.getMinimum(new int[]{4, 10, 21, 28, 3, 5});
        int resultFour = target.getMinimum(new int[]{4, 4, 4, 4, 4});
        int resultZero = target.getMinimum(new int[]{});

        assertEquals(-3, resultMinusThree);
        assertEquals(3, resultThree);
        assertEquals(4, resultFour);
        assertEquals(0, resultZero);
    }

    @Test
    void getPositive() {
        int[] resultAll = target.getPositive(new int[]{1, 2, 3, 8});
        int[] resultZero = target.getPositive(new int[]{-5, -8, -3});
        int[] resultZeroEmpty = target.getPositive(new int[]{});
        int[] resultOneEight = target.getPositive(new int[]{1, -2, -3, 8});

        assertArrayEquals(new int[]{1, 2, 3, 8}, resultAll);
        assertArrayEquals(new int[]{}, resultZero);
        assertArrayEquals(new int[]{}, resultZeroEmpty);
        assertArrayEquals(new int[]{1, 8}, resultOneEight);
    }

    @Test
    void getNumberDigits() {
        int[] resultOne = target.getNumberDigits(1);
        int[] resultTwelve = target.getNumberDigits(12);
        int[] resultZero = target.getNumberDigits(0000);

        assertArrayEquals(new int[]{1}, resultOne);
        assertArrayEquals(new int[]{2, 1}, resultTwelve);
        assertArrayEquals(new int[]{}, resultZero);
    }

    @Test
    void intListToArray() {
        int[] resultEmpty = target.intListToArray(new ArrayList<Integer>(){});
        int[] resultOneTwo = target.intListToArray(new ArrayList<Integer>(){{add(1);add(2);}});
        int[] resultZeroZero = target.intListToArray(new ArrayList<Integer>(){{add(0);add(0);}});

        assertArrayEquals(new int[]{}, resultEmpty);
        assertArrayEquals(new int[]{1, 2}, resultOneTwo);
        assertArrayEquals(new int[]{0, 0}, resultZeroZero);
    }

    @Test
    void getMinNegative() {
        int resultTen = target.getMinNegative(new int[]{1 ,5 ,-8, -10});
        int resultZero = target.getMinNegative(new int[]{1 ,5 ,8, 10});
        int resultZeroEmpty = target.getMinNegative(new int[]{});

        assertEquals(-10, resultTen);
        assertEquals(0, resultZeroEmpty);
        assertEquals(0, resultZero);
    }

    @Test
    void getMinimumPositivePaired() {
        int resultTwo = target.getMinimumPositivePaired(new int[]{1, 2, 3});
        int resultZero = target.getMinimumPositivePaired(new int[]{1, 1, 1});
        int resultZeroEmpty = target.getMinimumPositivePaired(new int[]{});
        int resultZeroAgain = target.getMinimumPositivePaired(new int[]{-2, 0, 2});

        assertEquals(2, resultTwo);
        assertEquals(0, resultZero);
        assertEquals(0, resultZeroEmpty);
        assertEquals(0, resultZeroAgain);
    }

    @Test
    void getPositivePaired() {
        int[] resultTwo = target.getPositivePaired(new int[]{1,2,3});
        int[] resultTwoZero = target.getPositivePaired(new int[]{0,1,2,3});
        int[] resultEmpty = target.getPositivePaired(new int[]{1,9,3});
        int[] resultEmptyToo = target.getPositivePaired(new int[]{});

        assertArrayEquals(new int[]{2}, resultTwo);
        assertArrayEquals(new int[]{0, 2}, resultTwoZero);
        assertArrayEquals(new int[]{}, resultEmpty);
        assertArrayEquals(new int[]{}, resultEmptyToo);
    }

    @Test
    void getCountOfItemsMultipleFive() {
        int resultOne = target.getCountOfItemsMultipleFive(new int[]{1,3,5,7,8});
        int resultAll = target.getCountOfItemsMultipleFive(new int[]{15,30,55,75,80});
        int resultZero = target.getCountOfItemsMultipleFive(new int[]{1,3,4,7,8});
        int resultMinusOne = target.getCountOfItemsMultipleFive(null);

        assertEquals(1, resultOne);
        assertEquals(5, resultAll);
        assertEquals(0, resultZero);
        assertEquals(-1, resultMinusOne);
    }

    @Test
    void getItemsMultipleFive() {
        int[] resultFive = target.getItemsMultipleFive(new int[]{1,3,5,7,9});
        int[] resultFiveFive = target.getItemsMultipleFive(new int[]{5,3,5,7,9});
        int[] resultZero = target.getItemsMultipleFive(new int[]{1, 2, 3});
        int[] resultZeroEmpty = target.getItemsMultipleFive(new int[]{});
        int[] resultZeroNull = target.getItemsMultipleFive(null);

        assertArrayEquals(new int[]{5}, resultFive);
        assertArrayEquals(new int[]{5, 5}, resultFiveFive);
        assertArrayEquals(new int[]{}, resultZero);
        assertArrayEquals(new int[]{}, resultZeroEmpty);
        assertArrayEquals(new int[]{}, resultZeroNull);
    }

    @Test
    void getSumPairedOnOddPlaces() {
        int resultFour = target.getSumPairedOnOddPlaces(new int[]{1, 3, 5, 4});
        int resultTwoFour = target.getSumPairedOnOddPlaces(new int[]{1, 2, 3, 4});
        int resultZeroEmpty = target.getSumPairedOnOddPlaces(new int[]{});
        int resultZero = target.getSumPairedOnOddPlaces(null);

        assertEquals(4, resultFour);
        assertEquals(6, resultTwoFour);
        assertEquals(-1, resultZero);
        assertEquals(0, resultZeroEmpty);
    }

    @Test
    void getPaired() {
        int[] resultTwoTwoFour = target.getPaired(new int[]{1, 2, 2, 3, 4});
        int[] resultMinusTwoTwoFour = target.getPaired(new int[]{-1, -2, -2, -3, -4});
        int[] resultEmpty = target.getPaired(new int[]{1, 1, 1});
        int[] resultEmptyNull = target.getPaired(null);

        assertArrayEquals(new int[]{2, 2, 4}, resultTwoTwoFour);
        assertArrayEquals(new int[]{-2, -2, -4}, resultMinusTwoTwoFour);
        assertArrayEquals(new int[]{}, resultEmpty);
        assertArrayEquals(new int[]{}, resultEmptyNull);
    }

    @Test
    void getItemsOnOddPlaces() {
        int[] resultOneThree = target.getItemsOnOddPlaces(new int[]{0, 1, 2, 3});
        int[] resultOneOne = target.getItemsOnOddPlaces(new int[]{1, 1, 1, 1});
        int[] resultEmptyArray = target.getItemsOnOddPlaces(new int[]{});
        int[] resultEmpty = target.getItemsOnOddPlaces(new int[]{0});
        int[] resultEmptyNull = target.getItemsOnOddPlaces(null);

        assertArrayEquals(new int[]{1, 3}, resultOneThree);
        assertArrayEquals(new int[]{1, 1}, resultOneOne);
        assertArrayEquals(new int[]{}, resultEmpty);
        assertArrayEquals(new int[]{}, resultEmptyArray);
        assertArrayEquals(new int[]{}, resultEmptyNull);
    }

    @Test
    void getSumOfSecondAndMostPositive() {
        int resultTen = target.getSumOfSecondAndMostPositive(new int[]{1, 2, 5, 8});
        int resultEight = target.getSumOfSecondAndMostPositive(new int[]{1, 4, 3, 2});
        int resultMinusOne = target.getSumOfSecondAndMostPositive(new int[]{1});
        int resultMinusOneNull = target.getSumOfSecondAndMostPositive(null);

        assertEquals(10, resultTen);
        assertEquals(8, resultEight);
        assertEquals(-1, resultMinusOne);
        assertEquals(-1, resultMinusOneNull);
    }

    @Test
    void getMostPositive() {
        int resultThree = target.getMostPositive(new int[]{1, 2, 3});
        int resultMinusTwo = target.getMostPositive(new int[]{-4, -2, -3});
        int resultMinusOneNull = target.getMostPositive(null);
        int resultMinusOneEmpty = target.getMostPositive(new int[]{});

        assertEquals(3, resultThree);
        assertEquals(-2, resultMinusTwo);
        assertEquals(-1, resultMinusOneNull);
        assertEquals(-1, resultMinusOneEmpty);
    }

}