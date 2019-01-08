import java.math.BigDecimal;

public class RevenueCalculatorImpl implements RevenueCalculator {
    @Override
    public BigDecimal calculateRevenue(BigDecimal marginPercentage, BigDecimal costOfGoods) {
        Double mtp = 1/(marginPercentage.doubleValue()/100);
        BigDecimal mtpCostOfGoods = costOfGoods.multiply(BigDecimal.valueOf(mtp));
        BigDecimal result = mtpCostOfGoods.divide(BigDecimal.valueOf(mtp-1));
        return result;
    }
}
