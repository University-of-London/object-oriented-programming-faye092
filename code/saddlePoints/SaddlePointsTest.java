package saddlePoints;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SaddlePointsTest {
    private saddlePoints.SaddlePoints sp;

    @Before
    public void setUp() throws Exception{
         sp = new saddlePoints.SaddlePoints(); // create an instance variable
    }

    @Test
    public void createRandomArray() {
        // test array size
        int[][] array = sp.createRandomArray(4,5,-5,10);
        assertEquals(4, array.length);
        assertEquals(5, array[0].length);
        // test array values range
        for (int[] row: array){
            for (int value: row){
                assertTrue(value >= -5 && value <= 1);
            }
        }
        // test the rows are not always the same
        for (int i = 0; i < 50; i++){
            array = sp.createRandomArray(3,3,-2,0);// narrower range
            assertFalse(Arrays.equals(array[0], array[1]));
        }
    }

    @Test
    public void largest() {
        //test empty array
        int[] array = new int[0];
        int[] finalArray = array;
        assertThrows(IllegalArgumentException.class, () -> sp.largest(finalArray));
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
        //test empty array
        int[] array = new int[0];
        int[] finalArray = array;
        assertThrows(IllegalArgumentException.class, () -> sp.smallest(finalArray));
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
        int[][] array = {{1,5,3},{-2,8,7}};
        assertArrayEquals(new int[]{5,8,7}, sp.largestValues(array));

        //get more test coverage
        int[][] array2 = {{0, 3, 3}, {5, 5, 1}, {2, -1, 4}};
        assertArrayEquals(new int[]{3, 5, 4}, sp.largestValues(array2));
    }

    @Test
    public void smallestValues() {
        int[][] array = {{1,5,3},{-2,8,7}};
        assertArrayEquals(new int[]{1,-2}, sp.smallestValues(array));

        //get more test coverage
        int[][] array2 = {{0, 3, 3}, {5, 5, 1}, {2, -1, 4}};
        assertArrayEquals(new int[]{0, 1, -1}, sp.smallestValues(array2));
    }

    @Test
    public void hasSaddlePoint() {
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
        //test empty array
        int[] array = new int[0];
        int[] finalArray = array;
        assertThrows(IllegalArgumentException.class, () -> sp.saddlePointRow(new int[][]{finalArray}));

        //test array with one element
        array = new int[]{1};
        assertEquals(-1, sp.saddlePointRow(new int[][]{array}));
        //test array with Saddle Point
        int[][] array2 = {{1,5,3},{2,4,7}};
        assertEquals(1, sp.saddlePointRow(array2));
        //test array with multiple Saddle Points
        int[][] array3 = {{1,5,3},{2,5,7},{3,5,9}};
        assertEquals(1, sp.saddlePointRow(array3));
        //test array with no Saddle Point
        int[][] array4 = {{1,5,3},{2,4,7},{3,7,9}};
        assertEquals(-1, sp.saddlePointRow(array4));
    }

    @Test
    public void saddlePointColumn() {
        //test empty array
        int[] array = new int[0];
        int[] finalArray = array;
        assertThrows(IllegalArgumentException.class, () -> sp.saddlePointColumn(new int[][]{finalArray}));
        //test array with one element
        array = new int[]{1};
        assertEquals(-1, sp.saddlePointColumn(new int[][]{array}));
        //test array with Saddle Point
        int[][] array2 = {{1,5,3},{2,4,7}};
        assertEquals(1, sp.saddlePointColumn(array2));
        //test array with multiple Saddle Points
        int[][] array3 = {{1,5,3},{2,5,7},{3,5,9}};
        assertEquals(1, sp.saddlePointColumn(array3));
        //test array with no Saddle Point
        int[][] array4 = {{1,5,3},{2,4,7},{3,7,9}};
        assertEquals(-1, sp.saddlePointColumn(array4));
    }

    private int[] setupArray(int elements){
        int[] array = new int[elements];
        for (int i = 0; i < elements; i++){
            array[i] = i;
        }
        return array;
    }
}