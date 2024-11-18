package Problem5;

public class Dog extends Animal{
	public Dog(String n, int a) {
		super(n, a);
	}
	@Override
	public void getSound() {
		System.out.println("Bark! Bark! Bark!");
	}
	@Override
	public String toString() {
		return "[Dog] " + super.toString();
	}
}
