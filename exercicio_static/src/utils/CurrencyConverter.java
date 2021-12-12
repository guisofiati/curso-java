package utils;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double amountInReais(double price, double quantity) {
		return quantity * price * (1.0 + IOF);
	}
}