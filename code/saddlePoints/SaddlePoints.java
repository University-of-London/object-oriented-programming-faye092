package saddlePoints;

import java.util.Random;

/**
 * Creates a number of random arrays, and checks each array to see
 * if it contains a saddle point. Prints the arrays and the results.
 *
 * @author
 */
public class SaddlePoints {
    /**
     * Creates arrays various sizes (including some 2x2 arrays and some larger),
     * fills them with random values, and prints each array and information about
     * it. Keeps generating arrays until it has printed at least one with and
     * one without a saddle point.
     */
    private final Random random = new Random(); // create a random class and array
    void run() {
        boolean hasSaddlePoint = false;
        boolean noSaddlePoint = false;

        while(!hasSaddlePoint || !noSaddlePoint){
            //create different scale arrays
            int[][] array = createRandomArray(random.nextInt(5) + 1,
                    random.nextInt(5)+1,-15,20);
            printArray(array);
            printArrayInfo(array);

            if (hasSaddlePoint(array)) hasSaddlePoint = true;
            else noSaddlePoint = true;
        }
    }

    /**
     * Prints the array.
     *
     * @param array The array to be printed.
     */
    void printArray(int[][] array) {
        for (int[] row: array){
            for (int value: row){
                System.out.printf("%4d",value);
            }
            System.out.println();
        }
    }

    /**
     * Prints whether the given array has a saddle point, and if so, where it is (row and column)
     * and what its value is. (If there are multiple saddle points, just prints the first.)
     *
     * @param array The array to be checked.
     */
    void printArrayInfo(int[][] array) {
        if (hasSaddlePoint(array)){
            int row = saddlePointRow(array);
            int col = saddlePointColumn(array);
            System.out.println("Array has a saddle point at row "+ row + ", column"
            + col + ", value " + array[row][col]);
        } else {
            System.out.println("Array does not have a saddle point.");
        }
        System.out.println();
    }

    /**
     * Creates and returns an array of the given size and fills it with random
     * values in the specified range.
     *
     * @param numberOfRows    The number of rows desired.
     * @param numberOfColumns The number of columns desired.
     * @param minValue        The smallest number allowable in the array.
     * @param maxValue        The largest number allowable in the array.
     * @return
     */
    int[][] createRandomArray(int numberOfRows, int numberOfColumns, int minValue, int maxValue) {
        int[][] array = new int[numberOfRows][numberOfColumns];

        for (int i = 0; i < numberOfRows; i++){
            for (int j = 0; j < numberOfColumns; j++){
                array[i][j] = random.nextInt(maxValue - minValue + 1) + minValue;
            }
        }
        return array;
    }

    /**
     * Finds the largest value in an array of integers.
     *
     * @param array The array to be searched.
     * @return The largest value in the array.
     */
    int largest(int[] array) {
        int max = Integer.MIN_VALUE; // set the max to the smallest possible value
        for (int value: array){
            max = Math.max(max, value);
        }
        return max;
    }

    /**
     * Finds the smallest value in an array of integers.
     *
     * @param array The array to be searched.
     * @return The smallest value in the array.
     */
    int smallest(int[] array) {
        int min = Integer.MAX_VALUE; // set the min to the largest possible value
        for (int value: array){
            min = Math.min(min, value);
        }
        return min;
    }

    /**
     * Returns an array containing the largest values in each column of the given array.
     *
     * @param array The array to be searched.
     * @return An array of the largest values in each column.
     */
    int[] largestValues(int[][] array) {
        int[] largestValues = new int[array[0].length]; //Column length

        for (int col = 0; col < largestValues.length; col++) {
            int colMax = Integer.MIN_VALUE;
            for (int row = 0; row < array.length; row++) {
                colMax = Math.max(colMax, array[row][col]);
            }
            largestValues[col] = colMax;
        }

        return largestValues;
    }

    /**
     * Returns an array containing the smallest values in each row of the given array.
     *
     * @param array The array to be searched.
     * @return An array of the smallest values in each row.
     */
    int[] smallestValues(int[][] array) {
        int[] smallestValues = new int[array.length];

        for (int row = 0; row < smallestValues.length; row++){
            int rowMin = Integer.MAX_VALUE;
            for (int col = 0; col < array[0].length; col++){
                rowMin = Math.min(rowMin, array[row][col]);
            }
            smallestValues[row] = rowMin;
        }

        return smallestValues;
    }


    /**
     * Returns true if the given array has a saddle point, and false if it does not.
     *
     * @param array The array to be checked.
     * @return True if the array has a saddle point, else false.
     */
    boolean hasSaddlePoint(int[][] array) {
        int[] rowMins = smallestValues(array);
        int[] colMaxs = largestValues(array);

        for (int i = 0; i < rowMins.length; i++){
            for (int j = 0; j < colMaxs.length; j++){
                if (rowMins[i] == colMaxs[j] && array[i][j] == rowMins[i]){
                    return true; // met a Saddle, the smallest value in a row is equal to the largest value in a column
                }
            }
        }
        return false;
    }

    /**
     * Given an array that is known to have a saddle point, returns the number of a
     * row containing a saddle point. If more than one row contains a saddle point,
     * the first such row will be returned.
     *
     * @param array An array containing one or more saddle points.
     * @return The lowest-numbered row containing a saddle point.
     */
    int saddlePointRow(int[][] array) {
        if (array == null) {
            throw new NullPointerException("Input array cannot be null");
        }

        int[] rowMins = smallestValues(array);
        int[] colMaxs = largestValues(array);

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                if (rowMins[row] == colMaxs[col]) {
                    return row;
                }
            }
        }

        return -1; // no saddle point found
    }

    /**
     * Given an array that is known to have a saddle point, returns the number of a
     * column containing a saddle point. If more than one column contains a saddle point,
     * the first such column will be returned.
     *
     * @param array An array containing one or more saddle points.
     * @return The lowest-numbered column containing a saddle point.
     */

    int saddlePointColumn(int[][] array) {
        if (array == null) {
            throw new NullPointerException("Input array cannot be null");
        }

        int[] rowMins = smallestValues(array);
        int[] colMaxs = largestValues(array);

        for (int col = 0; col < array[0].length; col++) {
            for (int row = 0; row < array.length; row++) {
                if (rowMins[row] == colMaxs[col]) {
                    return col;
                }
            }
        }

        return -1; // no saddle point found
    }
}