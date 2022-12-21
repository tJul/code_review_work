import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.add(1,1));
    }

    @Test
    void dif() {
        Calculator calc = new Calculator();
        assertEquals(5,calc.dif(9,4));
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.div(8,2));
    }

    @Test
    void times() {
        Calculator calc = new Calculator();
        assertEquals(6,calc.times(3,2));
    }

    @Test
    void solver() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.solver(1,-1));
    }
}