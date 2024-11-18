package Problem1;

public class StudentTest {
	public static void main(String[] args) {
		Student alex = new Student("Alex", 2023);
		System.out.println(alex.getId());
		alex.incrementYearOfStudy();
		System.out.println(alex.getYearOfStudy());
		Student zhantore = new Student("Zhantore", 2024);
		System.out.println(zhantore.getId());
	}
}
