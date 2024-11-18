package Problem3;

public class Temperature {
	private double temperature;
	private char scale;
	
	
	// constructors
	public Temperature() {
		this.temperature = 0.0;
		this.scale = 'C';
	}

	public Temperature(double temperature) {
		this.temperature = temperature;
		this.scale = 'C';
	}

	public Temperature(char scale) {
		this.scale = Character.toUpperCase(scale);
		this.temperature = 0.0;
	}

	public Temperature(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = Character.toUpperCase(scale);
	}
	
	
	// methods
	public double getFahrenheit() {
		if(scale == 'C') {
			temperature = 9*(temperature/5) + 32;
			scale = 'F';
			return temperature;
			
			}
		return temperature;
	}
	public double getCelsius() {
		if(scale == 'F') {
			this.temperature = (5*(temperature - 32))/9;
			scale = 'C';
			return temperature;
		}
		return temperature;
	}
	
	
	// set values
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public void setScale(char scale) {
		this.scale = Character.toUpperCase(scale);
	}
	public void setBothValue(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = Character.toUpperCase(scale);
	}
	
	public char getScale() {
		return scale;
	}
}
