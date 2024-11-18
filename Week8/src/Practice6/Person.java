package Practice6;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String n, int a) {
		this.name = n;
		this.age = a;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
