package Problem5;

public class Fish extends Animal{
	public Fish(String n, int a) {
		super(n, a);
	}
	@Override
	public void getSound() {
		System.out.println("Blub! Blub! Blub!");
	}
	@Override
	public String toString() {
		return "[Fish] " + super.toString();
	}
}
