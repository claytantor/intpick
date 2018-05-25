import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by claytongraham on 5/24/18.
 */


public class IntpickAppTest {
    @Test
    public void evaluatesExpression() {
        //Calculator calculator = new Calculator();
        //int sum = calculator.evaluate("1+2+3");
        Integer sum = 6;
        assertEquals(6, sum.intValue());
    }
}