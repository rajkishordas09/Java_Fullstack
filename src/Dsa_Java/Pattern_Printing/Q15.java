package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = ac.nextInt();
        int a = 0;
        for (int i = 1; i<= n ; i++){

            for (int j = 1; j <= n; j++) {
                if (i % 2 == 1) {
                    a++;
                    System.out.print(a + "\t");
                }
                else {

                    System.out.print(a + "\t");
                    a--;
                }
            }
            a += n;
            System.out.println();
        }

    }
}
