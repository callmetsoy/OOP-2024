package Problem1_3;

import java.util.Objects;

public class Technic {
	private String company;
	private String name;
	private int price;
	
	public Technic(String c, String n, int p) {
		this.company = c;
		this.name = n;
		this.price = p;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String c) {
		this.company = c;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int p) {
		this.price = p;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Technic technic = (Technic) o;
		return price == technic.price && Objects.equals(name, technic.name) && Objects.equals(company, technic.company);
	}
	
	public int hashCode() {
		int result = 1;
		result = 31 * result + (name != null ? name.hashCode(): 0);
		result = 31 * result + (company != null ? company.hashCode(): 0);
		result = 31 * result + price;
		return result;
	}
	
	public String toString() {
		return "Technic[" + "Company: " + company + "|" + "Name: " + name + "|" + "Price: " + price + "]";
	}
	
}
