package Problem3;

public class Account {
    private double balance; 
    private int accNumber;  

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double sum) { 
        this.balance += sum;
    }

    public void withdraw(double sum) { 
    	if(balance >= sum && sum > 0) {
    		this.balance -= sum;
        }else {
        	System.out.println("Insufficient funds");
        }
    	
    }

    public double getBalance() { 
        return balance;
    }

    public int getAccountNumber() { 
        return accNumber;
    }

    public void transfer(double amount, Account other) { 
        if(balance >= amount && amount > 0) {
        	withdraw(amount);
        	other.deposit(amount);
        }
    }
    public boolean equals(Object o) {
    	if(this == o) return true;
    	if(o == null) return false;
    	Account account = (Account) o;
    	return accNumber == account.accNumber;
    }

    public String toString() { 
        return "Account[" + "Balance: " + balance + " Account Number: " + accNumber + "]";
    }

    public final void print() {
        System.out.println(toString());
    }
}
