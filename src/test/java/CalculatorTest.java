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
        assertEquals(3, calc.dif(4, 1));
    }
    @Test
    void div() {
        assertEquals(3, calc.div(6, 2));
    }
    @Test
    void times() {
        assertEquals(8, calc.times(2, 4));
    }
    @Test
    void solver() {
        assertEquals(4, calc.solver());
    }
}