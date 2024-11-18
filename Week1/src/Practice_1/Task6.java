package Practice_1;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner Myobj = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String s = Myobj.nextLine();
		
		StringBuilder s1 = new StringBuilder(s);
		s1.reverse();
		
		if (s.equals(s1.toString())) {
			System.out.println("Palindrome string");
		} else {
			System.out.println("No a palindrome string");
		}
		
		Myobj.close();
	}
}