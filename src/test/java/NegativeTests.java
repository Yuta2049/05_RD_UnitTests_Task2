import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(JUnitPlatform.class)
@SelectClasses(NegativeTests.class )
public class NegativeTests {


    @Test
    void divisionByZero() {

        CalcService calcService = new CalcService();

        assertEquals(Infinity,     calcService.calculateResult("1/0"), "1/0 = Division by zero");

    }


    @Test
    void invalidExpression() {

        CalcService calcService = new CalcService();

        assertEquals("0.0",     calcService.calculateResult("asdf"), "Invalid expression for calculate 'asdf'");

    }


}
