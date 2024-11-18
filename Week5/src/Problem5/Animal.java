package Problem5;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String n, int a) {
		this.name = n;
		this.age = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public void getSound() {
		System.out.println("Animal sound");
	}
	public String toString() {
		return "Name: " + name + "| Age: " + age;
	}
}
