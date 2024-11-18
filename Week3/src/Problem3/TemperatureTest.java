package Problem3;

public class TemperatureTest {
	public static void main(String[] args) {
		Temperature t1 = new Temperature(36, 'C');
		System.out.print(t1.getFahrenheit() + " ");
		System.out.print(t1.getScale());
	}
}
