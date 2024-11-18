package Practice_1;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner Myobj = new Scanner(System.in);
		
		System.out.println("Enter your balance:");
		int b = Myobj.nextInt();
		
		System.out.println("Enter your precent:");
		double p = Myobj.nextInt();
		
		double account = (b/100)*p + b;
		System.out.println("Your account:"+ account);
		
		Myobj.close();
	}

}
