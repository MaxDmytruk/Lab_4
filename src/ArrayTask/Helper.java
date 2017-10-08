package ArrayTask;

import java.util.Random;
import java.util.Scanner;

public class Helper {
    public static int getIntInput() {
        try {
            return new Scanner(System.in).nextInt();
        } catch (Exception ex) {
            return getIntInput();
        }
    }
    public static void showArray(int[] array){
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
    public static void showMatrix(int[][] matrix){
        for (int[] row : matrix){
            for (int item : row){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
    public static int[] cloneArray(int[] arrayToCopy) {
        int[] clonedArray = new int[arrayToCopy.length];

        for (int i = 0; i < arrayToCopy.length; i++) {
            clonedArray[i] = arrayToCopy[i];
        }
        return clonedArray;
    }
    public static int[] generateArray(int arrayLength) {
        Random random = new Random();
        int[] result = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            result[i] = random.nextInt(10);
        }
        return result;
    }
}
