package Problem5;


public class Employee extends Person{
	private String company;
	private String position;
	
	public Employee(String name, int age, String company, String position) {
		super(name, age);
		this.company = company;
		this.position = position;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || !(o instanceof Employee)) return false;
		Employee employee = (Employee) o;
		return super.equals(employee) && company.equals(employee.company) && position.equals(employee.position);
	}
	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (company != null? company.hashCode(): 0);
		result = 31 * result + (position != null? company.hashCode(): 0);
		return result;
	}
	@Override
	public String getOccupation() {
		return "Employee works as " + position + " in " + company;
	}
	@Override
	public String toString() {
		return "[Employee] "+ super.toString() + "| Company: " + company + "| Position: " + position + "]";
	}
}
