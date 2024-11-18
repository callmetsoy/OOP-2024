package Practice6;

public class Restaurant {
	private String name;
	private int kapital;
	
	public Restaurant() {
		
	}
	
	public Restaurant(String n, int k) {
		this.name = n;
		this.kapital = k;
	}
	 void servePizza(CanHavePizza eater) {
	        eater.eatPizza();
	        if (eater instanceof Student) {
	            kapital += 1500;
	            System.out.println(name + "'s pizza was sold, + 1500 to kapital");
	        }
	    }
	public int getKapital() {
		return kapital;
	}
}
