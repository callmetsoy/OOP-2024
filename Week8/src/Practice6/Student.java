package Practice6;

public class Student extends Person implements CanHavePizza {
    private double balance = 10000;

    public Student() {}

    public Student(String name, int age, double balance) {
        super(name, age);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void eatPizza() {
        if (balance >= 1500) {
            balance -= 1500;
            System.out.println("Paid -1500 from your balance, student ate a pizza");
        } else {
            System.out.println("Not enough money, student didnt eat a pizza");
        }
    };

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Student s = (Student) o;
        return balance == s.balance;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result =  31 * result + (int) balance;
        return result;
    }

    @Override
    public String toString() {
        return "Student [balance=" + balance + "], " + super.toString();
    }
}