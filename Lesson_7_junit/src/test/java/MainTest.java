import org.example.Factorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(120, Factorial.getFactorial(5));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, Factorial.getFactorial(0));
        System.out.println("@BeforeEach");
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, Factorial.getFactorial(1));
    }

    @Test
    public void testFactorialNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.getFactorial(-5);
        });
        assertEquals("Число должно быть неотрицательным.", exception.getMessage());
    }


}
