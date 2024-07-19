package user;

import system.Management;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Management bank = new Management(scanner);
		
		System.out.print("Enter account number: ");
		bank.addAccountId();
		
		System.out.print("Enter account holder: ");
		bank.addName();
		
		System.out.print("Enter initial deposit value: ");
		bank.deposit();
		
		bank.printAccount();
		
		System.out.print("\nEnter a new deposit value: ");
		bank.deposit();
		
		bank.printAccount();
		
		System.out.print("\nEnter a new withdraw value: ");
		bank.withdraw();
		
		bank.printAccount();
		
		scanner.close();
		
	}
}
