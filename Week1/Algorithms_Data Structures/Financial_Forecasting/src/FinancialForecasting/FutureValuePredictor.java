package FinancialForecasting;

public class FutureValuePredictor {
	public static double futureValue(double principal, double rate, int years) {
        if (years == 0)
            return principal;
        else
        	return futureValue(principal * (1 + rate), rate, years - 1);
    }
}
