package system;

import java.util.Scanner;

public class Management {

	private BankAccount bank = new BankAccount();
	private Scanner scanner = new Scanner(System.in);

	public Management(Scanner scanner) {
		this.scanner = scanner;
	}

	public void addName() {
		String name = scanner.nextLine();
		bank.setName(name);
	}

	public void addAccountId() {

		while (true) {

			try {
				String id = scanner.nextLine();
				int verifyId = Integer.parseInt(id);
				bank.setAccountId(id);
				break;
			} catch (NumberFormatException e) {
				System.out.print("Invalid ID! Enter a valid account number: ");
			}
		}
	}

	public void deposit() {
		double value = scanner.nextDouble();
		bank.setBalance(bank.getBalance() + value);
	}

	public void withdraw() {

		try {
			if (bank.getBalance() > 0) {
				double value = scanner.nextDouble();

				if (value < bank.getBalance()) {
					bank.setBalance(bank.getBalance() - value - 5);
				}

				else {
					throw new Error("Impossible to withdraw: withdrawal amount is higher than balance");
				}
			}

			else {
				throw new Error("Impossible to withdraw: account is empty or has a negative balance.");
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void printAccount() {
		System.out.println("\nUpdated account data:\n" + bank.toString());
	}
}
