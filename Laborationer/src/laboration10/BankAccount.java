package laboration10;

import javax.swing.JOptionPane;

public class BankAccount {
	private String accountNbr;
	private int balance;
	private double interestRate;

	public void init(String accountNbr, int balance, double interestRate) {
		this.accountNbr = accountNbr;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdrawal(int amount) {
		balance -= amount;
	}
	
	public void info() {
		JOptionPane.showMessageDialog(null, "Account number: " + accountNbr +"\nBalance: " + balance);
	}


}
