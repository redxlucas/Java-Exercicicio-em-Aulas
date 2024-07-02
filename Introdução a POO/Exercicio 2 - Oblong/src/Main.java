import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Oblong oblong = new Oblong();
		
		System.out.println("Enter the width of the oblong: ");
		oblong.width = scanner.nextDouble();
		System.out.println("Enter the height of the oblong: ");
		oblong.height = scanner.nextDouble();
		
		System.out.println("\nArea of the oblong = " + oblong.Area());
		System.out.println("Perimeter of the oblong = " + oblong.Perimeter());
		System.out.printf("Diagonal of the oblong = %.2f", oblong.Diagonal());
		
		scanner.close();
	}

}
