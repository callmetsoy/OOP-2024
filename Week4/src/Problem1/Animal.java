package Problem1;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public Animal() {
		this.name = "No name yet";
	}
	public String getName() {
		return name;
	}
	
	public void sound() {
		System.out.println("\n" + "Animal sound");
	}
	public void sound(int times) {
		for(int i = 0; i < times; i++) {
			System.out.println("\n" + "Animal sound");
		}
	}

}

class Lion extends Animal {
	Lion(){
		super("Lion");
	}
	
	public void sound() {
		System.out.println("Roar!!!" + "\n");
	}
	public void sound(int times) {
		for(int i = 0; i < times; i++) {
			System.out.println("Roar!!!");
		}
	}
	public void makeSound() {
		super.sound();
	}
	public void makeSound(int times) {
		super.sound(times);
	}
}
