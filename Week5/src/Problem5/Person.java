package Problem5;

import java.util.Vector;

public abstract class Person {
	private String name;
	private int age;
	Vector <Animal> pets = new Vector<>();
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void assignPet(Animal pet) {
		if(pet instanceof Dog) {
			for(Animal cat : pets) {
				if(cat instanceof Cat) {
					System.out.println("You can't take dog, cat and dog will fight");
					return;
				}
			}
		if(pet instanceof Cat) {
			for(Animal dog : pets) {
				if(dog instanceof Dog) {
					System.out.println("You can't take cat, cat and dog will fight");
					return;
				}
			}
		}
		pets.add(pet);
	}
	}
	public void removePet(Animal pet) {
		pets.remove(pet);
	}
	public boolean hasPet() {
		return !pets.isEmpty();
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String s) {
		this.name = s;
	}
	public void setAge(int n) {
		this.age = n;
	}
	public Vector< Animal > getPets(){
		return pets;
	}
	
	public String getOccupation() {
		return "Person's occupation";
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || !(o instanceof Person)) return false;
		Person person = (Person) o;
		return age == person.age && name.equals(person.name) && pets == person.pets;
	}
	
	public int hashCode() {
		int result = 1;
		result = 31 * result + age;
		result = 31 * result + (name != null? name.hashCode(): 0);
		result = 31 * result + (pets.size() != 0? pets.hashCode(): 0);
		return result;
	}
	
	public String toString() {
		return "[Name: " + name + "| Age: " + age + "| Pet(s): " + pets;
	}
}
