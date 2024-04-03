package saddlePoints;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SaddlePointsTest {
    private saddlePoints.SaddlePoints sp;

    @Before
    public void setUp() {
         try{
             sp = new saddlePoints.SaddlePoints(); // create an instance variable
         }catch (Exception e){
             e.printStackTrace();
             fail("Failed to create SaddlePoints instance");
         }
    }

    @Test
    public void createRandomArray() {
        // test array size
        int[][] array1 = sp.createRandomArray(2,2,-10,10);
        assertEquals(2, array1.length);
        assertEquals(2, array1[0].length);

        int[][] array2 = sp.createRandomArray(5, 5, -100, 100);
        assertEquals(5, array2.length);
        assertEquals(5, array2[0].length);

        // test array values range
        for (int[] row: array1){
            for (int value: row){
                assertTrue(value >= -10 && value <= 10);
            }
        }

        for (int[] row : array2) {
            for (int value : row) {
                assertTrue(value >= -100 && value <= 100);
            }
        }

        // test the rows are not always the same
        assertFalse(Arrays.equals(array1[0], array1[1]));
        assertFalse(Arrays.equals(array2[0], array2[1]));
    }

    @Test
    public void largest() {
        //test null array
        int[] nullArray = null;
        assertThrows(NullPointerException.class, () -> {
            sp.largest(nullArray);
        });

        //test empty array
        int[] array = new int[0];
        assertEquals(Integer.MIN_VALUE, sp.largest(array));

        //test array with one element
        array = new int[]{5};
        assertEquals(5, sp.largest(array));

        //test array with multiple elements
        array = new int[]{8,15,11,9,12};
        assertEquals(15, sp.largest(array));

        //test array with repeated elements
        array = new int[]{8,15,11,9,12,15};
        assertEquals(15, sp.largest(array));
    }

    @Test
    public void smallest() {
        //test null array
        int[] nullArray = null;
        assertThrows(NullPointerException.class, () -> {
            sp.largest(nullArray);
        });

        //test empty array
        int[] array = new int[0];
        assertEquals(Integer.MAX_VALUE, sp.smallest(array));

        //test array with one element
        array = new int[]{2};
        assertEquals(2, sp.smallest(array));

        //test array with multiple elements
        array = new int[]{1, 5, 3, 2, 4};
        assertEquals(1, sp.smallest(array));

        //test array with repeated elements
        array = new int[]{1, 5, 3, 2, 4, 1};
        assertEquals(1, sp.smallest(array));
    }

    @Test
    public void largestValues() {
        //test null array and empty array
        int[][] nullArray = null;
        int[][] emptyArray = new int[0][0];
        assertThrows(IllegalArgumentException.class, () -> {
            sp.largestValues(nullArray);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            sp.largestValues(emptyArray);
        });

        //test array with single row
        int[][] array1 = {{1,5,3}};
        assertArrayEquals(new int[]{1,5,3}, sp.largestValues(array1));

        //test array with more than one row
        int[][] array2 = {{1,5,3},{-2,8,7}};
        assertArrayEquals(new int[]{1,8,7}, sp.largestValues(array2));

        //get more test coverage
        int[][] array3 = {{0, 3, 3}, {5, 5, 1}, {2, -1, 4}};
        assertArrayEquals(new int[]{5, 5, 4}, sp.largestValues(array3));
    }

    @Test
    public void smallestValues() {
        //test null array and empty array
        int[][] nullArray = null;
        int[][] emptyArray = new int[0][0];
        assertThrows(IllegalArgumentException.class, () -> {
            sp.largestValues(nullArray);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            sp.largestValues(emptyArray);
        });

        //test array with single row
        int[][] array1 = {{1,5,3}};
        assertArrayEquals(new int[]{1}, sp.smallestValues(array1));

        //test array with more than one row
        int[][] array2 = {{1,5,3},{-2,8,7}};
        assertArrayEquals(new int[]{1,-2}, sp.smallestValues(array2));

        //get more test coverage
        int[][] array3 = {{0, 3, 3}, {5, 5, 1}, {2, -1, 4}};
        assertArrayEquals(new int[]{0, 1, -1}, sp.smallestValues(array3));
    }

    @Test
    public void hasSaddlePoint() {
        //test null array
        int[][] nullArray = null;
        assertThrows(IllegalArgumentException.class, () -> {
            sp.hasSaddlePoint(nullArray);
        });

        //test array with saddle point and without saddle point
        int[][] with = {
                {-9, 12, -6},
                { 7, 14,  5},
                {10, -8,  3},
                { 6, 17,-10}};
        int[][] without = {
                { 1, -2,  3},
                {-6,  5, -4},
                { 7, -8,  9}};

        assertTrue(sp.hasSaddlePoint(with));
        assertFalse(sp.hasSaddlePoint(without));
    }

    @Test
    public void saddlePointRow() {
        // test null array
        int[][] array = null;
        assertThrows(NullPointerException.class, () -> {
            sp.saddlePointRow(array);
        });
        // test array 1: no saddle point
        int[][] array1 = {
                {4, 9, 3},
                {2, 8, 5},
                {9, 1, 6}};
        assertEquals(-1, sp.saddlePointRow(array1)); // No saddle point

        // test array 2: Saddle point
        int[][] array2 = {
                {3, 4, 5},
                {9, 5, 6},
                {-9, 3, 15}};
        assertEquals(1, sp.saddlePointRow(array2)); // Saddle point
    }

    @Test
    public void saddlePointColumn() {
        // test null array
        int[][] array = null;
        assertThrows(NullPointerException.class, () -> {
            sp.saddlePointRow(array);
        });
        // test array 1: no saddle point
        int[][] array1 = {
                {4, 9, 3},
                {2, 8, 5},
                {9, 1, 6}};
        assertEquals(-1, sp.saddlePointRow(array1)); // No saddle point

        // test array 2: Saddle point
        int[][] array2 = {
                {3, 4, 5},
                {9, 5, 6},
                {-9, 3, 15}};
        assertEquals(1, sp.saddlePointRow(array2)); // Saddle point
    }

    private int[] setupArray(int elements){
        int[] array = new int[elements];
        for (int i = 0; i < elements; i++){
            array[i] = i;
        }
        return array;
    }
}