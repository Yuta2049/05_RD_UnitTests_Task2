import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UnitTests {

    @Test
    void concantenateWords() {
        assertEquals(2, 1 + 1);

        //calculateResult(String expression)
        CalcService calcService = new CalcService();


        assertEquals(4,     calcService.calculateResult("1+3"), "1+3 = 4");
        assertEquals(-2,    calcService.calculateResult("1-3"), "1-3 = -2");
        assertEquals(3,     calcService.calculateResult("1*3"), "1*3 = 3");
        assertEquals(0.3333333333333333,   calcService.calculateResult("1/3"),  "1/3 = 0.3333333333333333");

    }
}
