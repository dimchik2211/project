package functionals;

import functions.Exponent;
import functions.RationalFunction;
import functions.Sinus;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegralTest {

    @Test
    public void solutionRationalFunc() throws RationalFunction.DenominatorEqualsZero {
        assertEquals(Math.log(2),new Integral<RationalFunction>(0,1).solution(new RationalFunction(0,3,0,1,1,1)),0.001 );
    }
    @Test
    public void solutionExpFunc() throws RationalFunction.DenominatorEqualsZero {
        assertEquals(Math.exp(1) - 1,new Integral<Exponent>(0,1).solution(new Exponent(0,3,1,0)),0.01 );
    }
    @Test
    public void solutionSinus() throws RationalFunction.DenominatorEqualsZero {
        assertEquals(3,new Integral<Sinus>(0,Math.PI/2).solution(new Sinus(0,3,3,1)),0.01 );
    }
    @Test(expected = IllegalArgumentException.class)
    public void solutionSinusFail() throws RationalFunction.DenominatorEqualsZero {
       Integral<Sinus> a = new Integral<Sinus>(0,Math.PI/2);
       a.solution(new Sinus(0,1,3,1));
       fail();
    }
}