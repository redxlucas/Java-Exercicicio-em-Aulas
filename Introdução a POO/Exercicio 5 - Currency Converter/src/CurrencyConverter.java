public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double DollarConverter(double dollar, int quantity) {
		return dollar * quantity * IOF;
	}

}
