package Practice6;

public class Cat extends Animal implements CanHavePizza{
	private String breed;
	public Cat(String n, int a, String b) {
		super(n, a);
		this.breed = b;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String b) {
		this.breed = b;
	}
	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Cat cat = (Cat) o;
		return breed.equals(cat.breed);
	}
	@Override
    public void eatPizza() {
        System.out.println("Cat has eaten pizza");
    };

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + breed.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cat [breed=" + breed + "], " + super.toString();
    }
}
