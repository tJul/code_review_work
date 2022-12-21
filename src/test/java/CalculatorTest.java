import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator= new Calculator()
    @Test
    void add() {assertEquals(3, calculator.add(1,2));}

    @Test
    void dif() {
        assertEquals(5, calculator.dif(7,2));
    }

    @Test
    void div() {assertEquals(6, calculator.div(42,7));}

    @Test
    void times() {
        assertEquals(40, calculator.times(5, 8));
    }

    @Test
    void solver() {assertEquals(2, calculator.solver(1, -2));}
}