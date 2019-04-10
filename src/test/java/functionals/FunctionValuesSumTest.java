package functionals;

import functions.Exponent;
import functions.RationalFunction;
import functions.Sinus;
import functions.StraightLine;
import org.junit.Test;

import java.util.zip.DataFormatException;

import static org.junit.Assert.*;

public class FunctionValuesSumTest {

    @Test
    public void functionValSrtaightLine() throws RationalFunction.DenominatorEqualsZero {
        assertEquals(12,new FunctionValuesSum<StraightLine>().solution
                (new StraightLine(1,3,1,2)),0.0001);
    }
    @Test
    public void functionValExp() throws RationalFunction.DenominatorEqualsZero {
        assertEquals(36.1928,new FunctionValuesSum<Exponent>().solution
                (new Exponent(1,3,1,2)),0.0001);
    }
    @Test
    public void functionValSin() throws RationalFunction.DenominatorEqualsZero {
        assertEquals(Math.sqrt(2) + 2,new FunctionValuesSum<Sinus>().solution
                (new Sinus(0,Math.PI/2,2,1)),0.0001);
    }
}