package Practice_1;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner Myobj = new Scanner(System.in);
		int n = Myobj.nextInt();
		boolean p = true;
		
		if(n <= 1) {
			System.out.println("NO");
		}
		
		else if(n > 1) {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if(n % i == 0) {
					p = false;
				}
			}
			if(p) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
		Myobj.close();
	}

}
