package system;

public class BankAccount {

	private String name;
	private String accountId;
	private double balance = 0;

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getAccountId() {
		return accountId;
	}

	protected void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	protected double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return "Account ID: " + accountId + ", Holder: " + name + ", Balance: R$ " + String.format("%.2f", balance);
	}

}
