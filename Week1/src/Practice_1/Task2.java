package Practice_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner Myobj = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        int a = Myobj.nextInt();
        
        double area = Math.pow(a, 2);        
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);
        
        System.out.println("Area = " + area + "\nPerimeter = " + perimeter + "\nDiagonal = " + diagonal);
        
        Myobj.close();
    }
}
