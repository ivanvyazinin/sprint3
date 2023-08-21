import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private int distance;
    private boolean isLarge;
    private boolean isFragile;
    private int expectedPrice;

    public CalculatorTest(int distance, boolean isLarge, boolean isFragile, int expectedPrice) {
        this.distance = distance;
        this.isLarge = isLarge;
        this.isFragile = isFragile;
        this.expectedPrice = expectedPrice;
    }

    @Parameterized.Parameters(name = "Distance is {0}, isLarge is {1}, isFragile is {2}, expectedPrice is {3}")
    public static Object[][] getData() {
        return new Object[][]{
                {1, false, false, 300},
                {50, true, true, 700},
                {3, true, true, 600},
                {0, false, false, 300},
                {2, true, true, 600},
                {10, true, true, 600}
        };
    }

    @Test
    public void checkCalculateRule() {
        int actualResult = Calculator.calculate(distance, isLarge, isFragile);
        assertEquals(expectedPrice, actualResult);
    }
}