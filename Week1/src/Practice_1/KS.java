package Practice_1;

import java.util.Scanner;

public class KS {
    public static void main(String[] args) {
        Scanner Myobj = new Scanner(System.in);
        int n = Myobj.nextInt();
        int S = 0;
        int K = 0;
        String[] sk = new String[n];
        
        
        for (int s = 0; s < n; s++) {
            if (sk[s].equals("K")) {
                K++;
            } else {
                S++;
            }
        }

        if (K > S) {
            System.out.println("KATSURAGI");
        } else if (S > K) {
            System.out.println("SAKAYANAGI");
        } else {
            if (sk[n - 1].equals("K")) {
                System.out.println("KATSURAGI");
            } else {
                System.out.println("SAKAYANAGI");
            }
        }

        Myobj.close();
    }
}
