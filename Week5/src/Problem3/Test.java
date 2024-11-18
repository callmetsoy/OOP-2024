package Problem3;

public class Test {
    public static void main(String[] args) {
        Bank centerCredit = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1001, 25);
        CheckingAccount checkingAccount = new CheckingAccount(1002);
        Account account = new Account(1003);

        centerCredit.openAccount(savingsAccount);
        centerCredit.openAccount(checkingAccount);
        centerCredit.openAccount(account);

        savingsAccount.deposit(500);
        checkingAccount.deposit(200);
        checkingAccount.withdraw(50);
        checkingAccount.withdraw(30);
        checkingAccount.deposit(100);
        checkingAccount.deposit(200);

        account.deposit(300);
        account.withdraw(100);

        System.out.println("Before update:");
        centerCredit.printAccounts();

        centerCredit.update();

        System.out.println("\nAfter update:");
        centerCredit.printAccounts();
    }
}