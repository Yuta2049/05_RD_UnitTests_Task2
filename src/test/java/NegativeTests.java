import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@RunWith(JUnitPlatform.class)
@SelectClasses(NegativeTests.class )
public class NegativeTests {


    @ParameterizedTest
    @CsvSource({"1/0", "-71/0", "0.1/0"})
    void divisionByZero(String expression) {

        CalcService calcService = new CalcService();

        assertThrows(IllegalArgumentException.class, () -> calcService.calculateSimpleExpression(expression));

    }

    @ParameterizedTest
    @CsvSource({"фвдлао", "adf", "0+1d"})
    void invalidExpression(String expression) {

        CalcService calcService = new CalcService();

        assertThrows(IllegalArgumentException.class, () -> calcService.checkExpression(expression));

    }

}
