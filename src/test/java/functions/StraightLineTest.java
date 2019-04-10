package functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class StraightLineTest {

    @Test
    public void getFunctionValueWithoutCoefs() {
        assertEquals(-4,new StraightLine(0,-9).getFunctionValue(-5),0.0001);
    }
    @Test
    public void getFunctionValue() {
        assertEquals(-1,new StraightLine(6,1,4,-9).getFunctionValue(2),0.0001);}
    @Test
    public void getPosValue() {
        assertEquals(9,new StraightLine(0,-9,0,9).getFunctionValue(-5),0.0001);}
    @Test(expected = IllegalArgumentException.class)
    public void argFail(){
        StraightLine a = new StraightLine(0,1);
        a.getFunctionValue(9);
        fail();
    }
}