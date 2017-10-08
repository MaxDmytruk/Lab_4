package ArrayTask;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
    public int arrayLength;
    public int[] array;

    public ArrayDemo(int arrayLength) {
        this.arrayLength = arrayLength;
        this.array = new int[arrayLength];
    }

    public int[] getArray() {
        return array;
    }

    public int getArrayLength() {
        return arrayLength;
    }

    public void init() {
            try {
                fillArrayWithRandom();
                System.out.print("Array: ");
                Helper.showArray(array);
                System.out.println();
                System.out.println("Arythmetical mean of paired elements: " + getArythmeticMeanOfPaired(array));
                System.out.println("Sum of min positive and it`s digits: " + getSumOfMinNumAndDigits(array));
                System.out.println("Product of the most negative and smallest paired: " + getMinNegative(array) * getMinimumPositivePaired(array));
                System.out.println("Count of items multiple 5: " + getCountOfItemsMultipleFive(array));
                System.out.println("Sum of the paired elements of the array standing on odd places " + getSumPairedOnOddPlaces(array));
                System.out.println("Sum of the second and most positive element " + getSumOfSecondAndMostPositive(array));
            } catch (Exception ex) {
                System.out.println(ex.getStackTrace());
            }
        }

    public void fillArrayWithRandom() {
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("array[" + (i + 1) + "] = ");
            array[i] = ArrayTask.Helper.getIntInput();
        }
    }

    public double getArythmeticMeanOfPaired(int[] elementsArray) {
        int pairedCount = 0;
        int pairedSum = 0;

        for (int element : elementsArray) {
            if (isPaired(element)) {
                pairedCount++;
                pairedSum += element;
            }
        }

        if (pairedCount == 0)
            return 0;
        return (double) (pairedSum / pairedCount);
    }

    public boolean isPaired(int element) {
        return element % 2 == 0;
    }

    public boolean isMultipleFive(int element) {
        return element % 5 == 0;
    }

    public int getSumOfMinNumAndDigits(int[] array) {
        int minNumber = getMinimumPositive(array);
        int sum = 0;
        int[] digits = getNumberDigits(minNumber);
        for (int digit : digits) {
            sum += digit;
        }
        return sum + minNumber;
    }

    public int getMinimumPositive(int[] array) {
        return getMinimum(getPositive(array));
    }

    public int getMinimum(int[] array) {
        int min = 0;
        if (array.length != 0)
            min = array[0];
        for (int item : array) {
            if (item < min)
                min = item;
        }
        return min;
    }

    public int[] getPositive(int[] array) {
        List<Integer> resultList = new ArrayList<Integer>();

        for (int item : array) {
            if (item > 0)
                resultList.add(item);
        }

        return intListToArray(resultList);
    }

    public int[] getNumberDigits(int number) {
        if (number > 0) {
            if (number < 9) {
                return new int[]{number};
            } else {
                List<Integer> digits = new ArrayList<Integer>();
                while (number >= 1) {
                    digits.add((int) (number % 10));
                    number /= 10;
                }
                return intListToArray(digits);
            }
        }
        return new int[]{};
    }

    public int[] intListToArray(List<Integer> list) {
        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }
        return resultArray;
    }

    public int getMinNegative(int[] array) {
        int min = getMinimum(array);
        if (min > 0) {
            return 0;
        } else {
            return min;
        }
    }

    public int getMinimumPositivePaired(int[] array) {
        return getMinimum(getPositivePaired(array));
    }

    public  int[] getPositivePaired(int[] array) {
        List<Integer> paired = new ArrayList<Integer>();
        for (int item : array) {
            if (isPaired(item) && item >= 0)
                paired.add(item);
        }
        return intListToArray(paired);
    }

    public  int getCountOfItemsMultipleFive(int[] array) {
        if(array == null){
            return -1;
        }
        int[] arrayMultipleFive = getItemsMultipleFive(array);
        return arrayMultipleFive.length;
    }

    public  int[] getItemsMultipleFive(int[] array) {
        if(array == null){
            return new int[]{};
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int item : array) {
            if (isMultipleFive(item)) {
                list.add(item);
            }
        }
        return intListToArray(list);
    }

    public  int getSumPairedOnOddPlaces(int[] array) {
        if(array == null){
            return -1;
        }
        int sum = 0;
        for (int item : getPaired(getItemsOnOddPlaces(array))) {
            sum += item;
        }
        return sum;
    }

    public  int[] getPaired(int[] array) {
        if(array == null){
            return new int[]{};
        }
        List<Integer> paired = new ArrayList<Integer>();
        for (int item : array) {
            if (isPaired(item))
                paired.add(item);
        }
        return intListToArray(paired);
    }

    public  int[] getItemsOnOddPlaces(int[] array) {
        if(array == null){
            return new int[]{};
        }
        List<Integer> oddList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 0) {
                oddList.add(array[i]);
            }
        }
        return intListToArray(oddList);
    }

    public  int getSumOfSecondAndMostPositive(int[] array) {
        if(array == null){
            return -1;
        }
        if (array.length > 1) {
            return getMostPositive(array) + array[1];
        } else
            return -1;//Error
    }

    public  int getMostPositive(int[] array) {
            if(array == null || array.length == 0){
                return -1;
            }
            int max = array[0];
            for (int item : array) {
                if (max < item)
                    max = item;
            }
            return max;
        }
}
