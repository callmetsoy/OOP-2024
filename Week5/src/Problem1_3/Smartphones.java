package Problem1_3;

public class Smartphones extends Technic {
	private int ram;
	private int battery;
	
	public Smartphones(String c, String n, int p, int r, int b) {
		super(c, n, p);
		this.ram = r;
		this.battery = b;
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int r) {
		this.ram = r;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int b) {
		this.battery = b;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Smartphones phone = (Smartphones) o;
		return super.equals(phone) && ram == phone.ram && battery == phone.battery;
	}
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + ram;
		result = 31 * result + battery;
		return result;
	}
}
