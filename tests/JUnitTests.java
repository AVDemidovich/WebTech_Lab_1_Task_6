/**
 * Created by Alexander_Demidovich on 10/8/2016.
 */

import Handler.Handler;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class JUnitTests {
    @Test
    public void MakeMatrix_1And2And5_trueReturned() {
        double[] numbersForMatrix = {1,2,5};
        double[][] expected = {
                {1,2,5},
                {2,5,1},
                {5,1,2}
        };
        double[][] actual;
        actual = Handler.makeMatrix(numbersForMatrix);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void MakeMatrix_EmptyArray_EmptyArrReturned() {
        double[] actual = {};
        double[] expected = {};
        Handler.makeMatrix(actual);
        assertArrayEquals(expected, actual,0.01);
    }
    @Test
    public void MakeMatrix_Null_nullArrReturned() {
        double[] actual = {};
        double[] expected = {};
        Handler.makeMatrix(actual);
        assertArrayEquals(expected, actual,0.01);
    }
}
