import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveTests {

    public final double precision = 0.000001;


    @Test
    void testSimpleExpressionAddition() {

        CalcService calcService = new CalcService();

        assertEquals(4, calcService.calculateSimpleExpression("1+3"), "1+3 = 4");
        assertEquals(2, calcService.calculateSimpleExpression("-1+3"), "-1+3 = 2");
        assertEquals(23.3, calcService.calculateSimpleExpression("10.5+12.8"), "10.5+12.8 = 23.3");

    }

    @Test
    void testSimpleExpressionSubstraction() {

        CalcService calcService = new CalcService();

        assertEquals(-2, calcService.calculateSimpleExpression("1-3"), "1-3 = -2");
        assertEquals(-4, calcService.calculateSimpleExpression("-1-3"), "-1-3 = -4");
        assertEquals(-2.3, calcService.calculateSimpleExpression("10.5-12.8"), precision, "10.5-12.8 = -2.3");

    }

    @Test
    void testSimpleExpressionMultiplication() {

        CalcService calcService = new CalcService();

        assertEquals(3, calcService.calculateSimpleExpression("1*3"), "1*3 = 3");
        assertEquals(-3, calcService.calculateSimpleExpression("-1*3"), "-1*3 = -3");
        assertEquals(134.4, calcService.calculateSimpleExpression("10.5*12.8"), "10.5*12.8 = 134.4");

    }

    @Test
    void testSimpleExpressionDivision() {

        CalcService calcService = new CalcService();

        assertEquals(0.33333333, calcService.calculateSimpleExpression("1/3"), precision, "1/3 = 0.33333333");
        assertEquals(-0.33333333, calcService.calculateSimpleExpression("-1/3"), precision, "-1/3 = -0.33333333");
        assertEquals(0.820312, calcService.calculateSimpleExpression("10.5/12.8"), precision, "10.5+12.8 = 0.820312");

    }

    @Test
    void calcExpressionWithoutParenthesis() {

        CalcService calcService = new CalcService();

        assertThat("5+4+3", calcService.calcExpressionWithoutParenthesis("5+4+3"), equalTo(12.0));

    }

    @Test
    void removeParenthesis() {

        CalcService calcService = new CalcService();

        assertThat("(5+4+3)", calcService.calcExpressionWithoutParenthesis("5+4+3"), equalTo(12.0));
        //"12-5*((1.5+5) + 8*40)-4*20,5"
        assertThat("12-5*((1.5+5)+8*40)-4*20.5", calcService.calc("12-5*((1.5+5)+8*40)-4*20.5"), equalTo(-1702.5));

    }


}
