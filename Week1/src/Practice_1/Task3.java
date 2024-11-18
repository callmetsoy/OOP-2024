package Practice_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    		    Scanner input = new Scanner(System.in);
    		    int point = input.nextInt();
    		    input.close();
    		      String[] grade = {"F", "D-","D+","C-","C","C+","B-","b","B+","A-","A+"};
    		      
    		      
    		      String result = (point < 50) ? grade[0] : grade[point/5-9];
    		      System.out.println(result);
    		       
    }
}
