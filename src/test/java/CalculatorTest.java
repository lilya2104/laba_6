import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(2, calc.add(1, 1));
    }

    @Test
    void dif() {
        assertEquals(2, calc.dif(3, 1));
    }

    @Test
    void div() {
        assertEquals(2, calc.div(2, 1));
    }

    @Test
    void times() {
        assertEquals(1, calc.times(2, 2));
    }

    @Test
    void solver() {
        assertEquals(1, calc.solver(2, 1));
    }
}