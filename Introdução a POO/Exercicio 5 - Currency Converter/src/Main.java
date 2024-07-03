import java.util.*;

public class Main {


	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		CurrencyConverter currency = new CurrencyConverter();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollar = scanner.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		int quantity = scanner.nextInt();
		
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.DollarConverter(dollar, quantity));
		
		scanner.close();
		
	}
}

