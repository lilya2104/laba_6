import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    Calculator calcul = new Calculator();
    @Test
    void add() {
        assertEquals(5, calcul.add(-2, 7));
    }
    @Test
    void dif() {
        assertEquals(-14, calcul.dif(-9, 5));
    }
    @Test
    void div() {
        assertEquals(-3, calcul.div(-6, 2));
    }
    @Test
    void times() {
        assertEquals(-9, calcul.times(-3, 3));
    }
    @Test
    void solver() {
        assertEquals(-12, calcul.solver());
    }
}