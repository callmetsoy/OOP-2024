package Practice6;

public class Animal {
	private String name;
	private int age;
	public Animal() {
		
	}
	public Animal(String n, int a) {
		this.name = n;
		this.age = a;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public boolean equals(Object o) {
		if(this ==  o) return true;
		if(o == null || !(o instanceof Cat)) return false;
		Animal animal = (Animal) o;
		return age == animal.age && name.equals(animal.name);
	}
	public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }
}
