import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Enter the name of the employee: ");
		employee.name = scanner.nextLine();
		System.out.println("Enter the salary of the employee: ");
		employee.grossSalary = scanner.nextDouble();
		System.out.println("Enter the tax: ");
		employee.tax = scanner.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $" + employee.NetSalary());
		
		System.out.println("Which percentage to increase salary? ");
		int percentage = scanner.nextInt();
		
		System.out.println("Update data: " + employee.name + ", $" + employee.IncreaseSalary(percentage));

	}

}
