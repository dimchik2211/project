import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTripleProcessorTest {

    @Test
    public void getGreatestRootLessZero() throws SolutionEx{
        assertEquals(-1,new SquareTripleProcessor(new SquareTriple(1,4,3)).getGreatestRoot(),0.0001);
    }
    @Test
    public void oneRootIsGreatest() throws SolutionEx{
        assertEquals(1,new SquareTripleProcessor(new SquareTriple(1,-2,1)).getGreatestRoot(),0.0001);
    }
    @Test
    public void greatestRoot() throws SolutionEx{
        assertEquals(3,new SquareTripleProcessor(new SquareTriple(1,-5,6)).getGreatestRoot(),0.0001);
    }
    @Test
    public void getGreatestDoubleRoot() throws SolutionEx{
        assertEquals(1.5,new SquareTripleProcessor(new SquareTriple(1,-2.5,1.5)).getGreatestRoot(),0.0001);
    }
    @Test(expected = SolutionEx.class)
    public void getGreatestRootFail()throws SolutionEx{
        assertEquals(1.5,new SquareTripleProcessor(new SquareTriple(1,1,3)).getGreatestRoot(),0.0001);
        fail();
    }
}