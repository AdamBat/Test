import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RevenueCalcTest {
    RevenueCalculatorImpl revenueCalculator = new RevenueCalculatorImpl();

    @Test
    public void revCalcTest() {
        assertEquals(new BigDecimal(500), revenueCalculator.calculateRevenue(new BigDecimal(20), new BigDecimal(400)));
        assertEquals(new BigDecimal(100), revenueCalculator.calculateRevenue(new BigDecimal(10), new BigDecimal(90)));
    }
}
