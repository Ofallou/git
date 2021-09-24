package fall.meissa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Addition addition = new Addition();
        double a=9;
        double b=6;
        double expected=15;
        double result=addition.add(a,b);
        assertEquals(result, expected, 0.001);

    }
    @Test
    public void shouldAnswerIsEquals(){

                assertTrue("message true", 1+1==2);

    }

}
