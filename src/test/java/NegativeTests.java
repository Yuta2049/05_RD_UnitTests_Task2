import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@RunWith(JUnitPlatform.class)
@SelectClasses(NegativeTests.class )
public class NegativeTests {


    @Test
    void divisionByZero() {

        CalcService calcService = new CalcService();

        assertThrows(IllegalArgumentException.class, () -> calcService.calculateSimpleExpression("1/0"));
        assertThrows(IllegalArgumentException.class, () -> calcService.calculateSimpleExpression("-71/0"));
        assertThrows(IllegalArgumentException.class, () -> calcService.calculateSimpleExpression("0.1/0"));

    }

    @Test
    void invalidExpression() {

        CalcService calcService = new CalcService();

        //assertThrows(IllegalArgumentException.class, () -> calcService.calculateSimpleExpression("sldkfj"));
        assertEquals(-2.3, calcService.calc("asdf"), 0.1, "asdf");
        //assertEquals("0.0",     calcService.calculateResult("asdf"), "Invalid expression for calculate 'asdf'");

    }

}
