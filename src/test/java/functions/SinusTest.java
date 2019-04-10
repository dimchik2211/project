package functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class SinusTest {

    @Test
    public void getIrrationalValue() {
        assertEquals(Math.sqrt(2), new Sinus(1,0,2,2).getFunctionValue(Math.PI/8),0.001);

    }
    @Test
    public void getPosValue() {
        assertEquals(5, new Sinus(1,0,5,2).getFunctionValue(Math.PI/4),0.001);}
    @Test
    public void getNegValue() {
        assertEquals(-0.999,new Sinus(2,56).getFunctionValue(55),0.001);}
    @Test
    public void getFunctionValue() {
        assertEquals(0.8414,new Sinus(1,1).getFunctionValue(1),0.001);}
    @Test(expected = IllegalArgumentException.class)
    public void argFail(){
        Sinus a = new Sinus(0,1);
        a.getFunctionValue(4);
        fail();
    }
}