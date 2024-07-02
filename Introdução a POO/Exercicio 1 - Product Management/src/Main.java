import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = scanner.nextLine();
		System.out.println("Price: ");
		product.price = scanner.nextDouble();
		System.out.println("Quantity: ");
		product.quantity = scanner.nextInt();
		System.out.println("Product data: "+ product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = scanner.nextInt();
		product.AddProducts(quantity);
		
		System.out.println("Update data: " + product);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = scanner.nextInt();
		product.RemoveProducts(quantity);
		
		System.out.println("Update data: " + product);
		
		scanner.close();

	}

}
