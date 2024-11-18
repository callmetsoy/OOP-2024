package Practice_1;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {
		Scanner Myobj = new Scanner(System.in);
		
		System.out.println("Enter first parametr:");
		int a = Myobj.nextInt();
		
		System.out.println("Enter second parametr:");
		int b = Myobj.nextInt();
		
		System.out.println("Enter third parametr:");
		int c = Myobj.nextInt();
		
		int D = b*b - 4 * a * c;
		
		if(D < 0) {
			System.out.println("No roots");
		} else if(D == 0) {
			double x = -b/(2*a);
			System.out.println(x);
		} else {
			double x1 = (-b-Math.sqrt(D))/(2*a);
			double x2 = (-b+Math.sqrt(D))/(2*a);
			System.out.println("First root = " + x1 +"\nSecond root = " + x2);
		}
		
		Myobj.close();
		}
}
