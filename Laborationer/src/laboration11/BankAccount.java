package laboration11;

import javax.swing.JOptionPane;

public class BankAccount {
	private String accountNbr;
	private double balance;
	private double interestRate;

	public BankAccount(String accountNbr) {
		this.accountNbr = accountNbr;
		balance = 0;
		interestRate = 0.005;
	}

	public BankAccount(String accountNbr, double balance, double interestRate) {
		this.accountNbr = accountNbr;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccountNbr() {
		return accountNbr;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void deposit(double amount){
		balance +=amount;
	}
	
	public void withdrawal(double amount){
		balance -= amount;
	}
	
	public void info(){
		JOptionPane.showMessageDialog(null, "Account number: "+ accountNbr + "\nBalance: " + balance);
	}
}
