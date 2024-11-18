package Problem1;

public class AnimalTest {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.sound();
		lion.sound(3);
		System.out.println(lion.getName());
		
		lion.makeSound();
		lion.makeSound(3);
		
	}
}
