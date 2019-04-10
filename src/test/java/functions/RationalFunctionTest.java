package functions;

import org.junit.Test;

import static org.junit.Assert.*;

public class RationalFunctionTest {

    @Test(expected = RationalFunction.DenominatorEqualsZero.class)
    public void denominIaZero() throws RationalFunction.DenominatorEqualsZero{
        RationalFunction a = new RationalFunction(1,2,0,0,5,-5);
        a.getFunctionValue(1);
        fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void funcNotDeterm() throws RationalFunction.DenominatorEqualsZero{
        RationalFunction a = new RationalFunction(1,2,0,0,5,-5);
        a.getFunctionValue(0);
        fail();
    }
    @Test
    public void getZeroValue() throws RationalFunction.DenominatorEqualsZero{
        assertEquals(0,new RationalFunction(0,2,1,-1,6,-5).getFunctionValue(1),0.001);
    }
    @Test
    public void getPositValue() throws RationalFunction.DenominatorEqualsZero{
        assertEquals(0.333,new RationalFunction(8,2,2,-5,6,-15).getFunctionValue(3),0.001);}
    @Test
    public void getNegValue() throws RationalFunction.DenominatorEqualsZero{
        assertEquals(-0.2,new RationalFunction(0,2,2,1,6,-5).getFunctionValue(0),0.001);}

    @Test
    public void getA() {
        assertEquals(1,new RationalFunction(5,1).getA(),0.001);
    }

    @Test
    public void getB() {
        assertEquals(-1,new RationalFunction(-2,-1).getB(),0.001);
    }
}