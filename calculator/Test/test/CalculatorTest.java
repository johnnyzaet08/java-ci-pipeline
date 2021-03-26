import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator cal =new Calculator();
    @Test
    void suma() {

        assertEquals(10, cal.suma(2,8));
        assertEquals(16, cal.suma(10,6));
    }

    @Test
    void resta() {
        assertEquals(4, cal.resta(10,6));
        assertEquals(7, cal.resta(14,7));
    }

    @Test
    void multi() {
        assertEquals(22, cal.multi(11,2));
        assertEquals(15, cal.multi(5,3));
    }

    @Test
    void div() {
        assertEquals(8,cal.div(64,8));
        assertEquals(2,cal.div(6,3));
        assertEquals(0,cal.div(29,0));
    }
}