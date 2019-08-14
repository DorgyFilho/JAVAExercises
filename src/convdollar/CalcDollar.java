package convdollar;

public class CalcDollar {
	public static final double IOF = 0.06;
	
	public static double convDollar(double priceDollar, double buyDollars) {
		double result = priceDollar*buyDollars;
		result += IOF*result;
		return result;		
	}
	

}
