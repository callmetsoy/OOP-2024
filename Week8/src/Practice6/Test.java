package Practice6;

public class Test {
	public static void main(String[] args) {
		Cat danyasCat = new Cat("Murzik", 12, "Siberian");
		Student danya = new Student("Danya", 20, 3000);
		Restaurant ratatoue = new Restaurant("Gusto", 1000);
		
		ratatoue.servePizza(danyasCat);
        ratatoue.servePizza(danya);
        System.out.println(ratatoue.getKapital());
	}
}
