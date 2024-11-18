package Problem3;

public class SavingsAccount extends Account{
	private double interestRate;
	
	public SavingsAccount(int n, double i) {
		super(n);
		this.interestRate = i;
	}
	public void addInterest() {
		double interest = getBalance() * (interestRate/100);
		deposit(interest);
	}
	@Override
	public String toString() {
		return "[Savings account]" + " Balance: " + getBalance() + " Account number: " + getAccountNumber() + " Interest rate: " + interestRate;
	}
}
