package util;

public class CurrencyConverter {
	
	public static double conversion(double dollar, double quantity) {
		return dollar * quantity + 0.06 * dollar * quantity;
	}
}
