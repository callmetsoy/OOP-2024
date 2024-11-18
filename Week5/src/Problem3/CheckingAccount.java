package Problem3;

public class CheckingAccount extends Account{
	private final static int TRANSACTION = 2;
	private final static double TRANSACTION_FEE = 0.02;
	private int numberOfTransaction;
	
	public CheckingAccount(int n) {
		super(n);
		this.numberOfTransaction = 0;
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		numberOfTransaction++;
	}
	public void withdraw(double sum) {
		super.withdraw(sum);
		numberOfTransaction++;
	}
	public void deductFee(){
		if(numberOfTransaction > TRANSACTION) {
			double fee = (numberOfTransaction - TRANSACTION) * TRANSACTION_FEE;
			super.withdraw(fee);
			numberOfTransaction = 2;
		}
	}
	@Override
	public String toString() {
		return "[Checking account]" + " Balance: " + getBalance() + " " + "Account number: " + getAccountNumber();
	} 
}
