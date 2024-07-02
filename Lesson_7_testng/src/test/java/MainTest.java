import org.example.Factorial;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MainTest {
    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(Factorial.getFactorial(5), 120);
    }

    @Test
    public void testFactorialZero() {
        assertEquals(Factorial.getFactorial(0), 1);
    }

    @Test
    public void testFactorialOne() {
        assertEquals(Factorial.getFactorial(1), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Число должно быть неотрицательным.")
    public void testFactorialNegativeNumber() {
        Factorial.getFactorial(-5);
    }


}
