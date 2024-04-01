package saddlePoints;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SaddlePointsTest {
    private saddlePoints.SaddlePoints sp;

    @Before
    public void setUp() throws Exception {
         sp = new saddlePoints.SaddlePoints(); // create an instance variable
    }

    @Test
    public void createRandomArray() {
        // test the createRandomArray method to see if it creates an array of the correct size
        int[][] array = sp.createRandomArray(3,4,-10,10);
        assertEquals(3, array.length);
        assertEquals(4, array[0].length);
        // test the createRandomArray method to see if it creates an array of the correct range
        for (int[] row: array){
            for (int value: row){
                assertTrue(value >= -10 && value <= 10);
            }
        }
        //
        array = sp.createRandomArray(2, 2, 0, 0);
        assertFalse(Arrays.deepEquals(array[0], array[1]));
    }

    @Test
    public void largest() {


    }

    @Test
    public void smallest() {
    }

    @Test
    public void largestValues() {
        int[][] array = {{1,5,3},{-2,8,7}};
        assertArrayEquals(new int[]{5,8,7}, sp.largestValues(array));
    }

    @Test
    public void smallestValues() {
        int[][] array = {{1,5,3},{-2,8,7}};
        assertArrayEquals(new int[]{1,-2}, sp.smallestValues(array));
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
    }

    @Test
    public void saddlePointColumn() {
    }

    private int[] setupArray(int elements){

    }
}