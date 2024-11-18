package Problem1_2;

public class TestLibrary {
	public static void main(String[] args) {
		Book b1 = new Book("HUNTER X HUNTER", "Yoshiro Togashi", 2018, 120, "Manga");
		b1.annotation();
		System.out.println(b1.toString());
	}
}
