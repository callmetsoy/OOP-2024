package Problem1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
    	Scanner myObj = new Scanner(System.in);
        Data value = new Data();

        while (true) {
            System.out.println("Enter number (Q to quit): ");
            String data = myObj.nextLine();
            if (data.equalsIgnoreCase("q")) {
                break;
            }
            double num = Double.parseDouble(data);
            value.addValue(num);
        }
        myObj.close();
        System.out.println("Average = " + value.getAverage());
        System.out.println("Maximum = " + value.getLargest());
    }
}