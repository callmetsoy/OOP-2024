package Problem5;

public class Cat extends Animal{
	public Cat(String n, int a) {
		super(n, a);
	}
	@Override
	public void getSound() {
		System.out.println("Meow! Meow! Meow!");
	}
	@Override
	public String toString() {
		return "[Cat] " + super.toString();
	}
}
