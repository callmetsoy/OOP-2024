package Problem5;

public class Bird extends Animal{
	public Bird(String n, int a) {
		super(n, a);
	}
	@Override
	public void getSound() {
		System.out.println("Fein! Fein! Fein!");
	}
	@Override
	public String toString() {
		return "[Bird] " + super.toString();
	}
}
