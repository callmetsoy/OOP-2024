package Problem1_3;

public class Test {
	public static void main(String[] args) {
		Smartphones s1 = new Smartphones("Apple", "iphone 16 pro max", 1400, 8, 4685);
		Smartphones s2 = new Smartphones("Apple", "iphone 16 pro", 1200, 8, 3582);
		System.out.println((s1.hashCode() == s2.hashCode()) ? "YES" : "NO");
		
	}
}
