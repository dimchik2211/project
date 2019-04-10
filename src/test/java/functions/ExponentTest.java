package functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentTest {

    @Test
    public void getFunctionValue() {
        assertEquals(15.778,new Exponent(3,2,2,1).getFunctionValue(2),0.001);
    }
    @Test
    public void argLessZero(){
        assertEquals(10.027,new Exponent(-4,-6,4,10).getFunctionValue(-5),0.001);
    }
    @Test
    public void argIsZero(){
        assertEquals(-11,new Exponent(-2,1,10,-21).getFunctionValue(0),0.001);
    }
    @Test
    public void segmIsOneNumb(){
        assertEquals(0,new Exponent(0,0,5,-5).getFunctionValue(0),0.001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void funcNotDetermine() {
        Exponent a = new Exponent(0, 0, 2, 1);
        a.getFunctionValue(1);
        fail();
    }
}