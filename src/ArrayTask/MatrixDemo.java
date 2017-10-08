package ArrayTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatrixDemo {
    final int MATRIX_ORDER = 10;
    public int[][] matrix;
    public int matrixOrder;

    public MatrixDemo(int matrixOrder) {
        this.matrixOrder = matrixOrder;
        this.matrix = new int[matrixOrder][matrixOrder];
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getMatrixOrder() {
        return matrixOrder;
    }

    public  void init(){
        //matrix = new int[matrixOrder][matrixOrder];
        //matrix = createMonotonousMatrix(matrixOrder);

        //Task 1
        try {
            matrix = createMatrix(matrixOrder);
            ArrayTask.Helper.showMatrix(matrix);

            int[] rowsAllEven = getAllEvenRow(matrix);
            System.out.print("Rows in which all items are even: ");
            outputResult(rowsAllEven);
            System.out.println();

            int[] monotonousRows = getMonotonuosRows(matrix);
            System.out.print("Rows in which every item monotoniously increase or decrease: ");
            outputResult(monotonousRows);
            System.out.println();

            //Task 2

            int[][] secondMatrix = createMatrix(MATRIX_ORDER);
            ArrayTask.Helper.showMatrix(secondMatrix );
            getResult(secondMatrix );
        }
        catch (Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }

    public  void getResult(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if((i == j) && (matrix[i][j] < 0)){
                    System.out.println("Sum of the row with " + matrix[i][j] + " item on main diagonal: " + getSumOfRow(matrix[i]));
                    System.out.println("Max element of the row with " + matrix[i][j] + " item on main diagonal: " + getMaxInRow(matrix[i]));
                }
            }
        }
    }

    public  void outputResult(int[] rows){
        if(rows.length == 0)
            System.out.println("none");
        else{
            for (int item : rows) {
                System.out.print(item);
            }
        }
    }

    public  int[][] createMatrix(int order){
        Random random = new Random();
        int[][] matrix = new int[order][order];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(10) - 5;
            }
        }
        return matrix;
    }

    public  int[][] createMonotonousMatrix(int order){
        int[][] matrix = new int[order][order];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = j;
            }
        }
        return matrix;
    }

    public  int[] getAllEvenRow(int[][] matrix){
        if(matrix == null){
            return new int[]{};
        }
        List<Integer> evenRows = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++){
            if(matrix[i] == null || matrix[i].length == 0){
                return new int[]{};
            }
            if(isAllItemsEven(matrix[i]))
                evenRows.add(i);
        }
        return intListToArray(evenRows);
    }

    public  int[] intListToArray(List<Integer> list){
        if(list == null) {
            return new int[]{};
        }
        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }
        return resultArray;
    }

    public  boolean isAllItemsEven(int[] row){
        if(row == null || row.length == 0){
            return false;
        }
        int firstElement = row[0];
        for (int element : row) {
            if(firstElement != element)
                return false;
        }
        return true;
    }

    public  int[] getMonotonuosRows(int[][] matrix){
        if(matrix == null){
            return new int[]{};
        }
        List<Integer> monotonousRows = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++){
            if(matrix[i] == null || matrix[i].length == 0){
                return new int[]{};
            }
            if (isMonotonousSequence(matrix[i])){
                monotonousRows.add(i);
            }
        }

        return intListToArray(monotonousRows);
    }

    public  boolean isMonotonousSequence(int[] array){
        if(array == null || array.length < 1){
            return false;
        }
        else if(array.length == 1){
            return true;
        }
        if(array[0] == array[1])
            return false;
        String flag = array[0] > array[1] ? "decr" : "incr";
        for (int i = 1; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                if(flag == "incr")
                    return false;
            }
            else {
                if (flag == "decr"){
                    return false;
                }
            }
        }
        return true;
    }

    public  int getSumOfRow(int[] row){
        if(row == null){
            return 0;
        }
        int sum = 0;
        for (int item : row){
            sum += item;
        }
        return sum;
    }

    public  int getMaxInRow(int[] row){
        try {
            int max = row[0];
            for (int item : row) {
                if(item > max)
                    max = item;
            }
            return max;
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return -99;//Error
    }
}
