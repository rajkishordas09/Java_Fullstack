package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = ac.nextInt();

        for (int i = 1; i<= n ; i++){
              int a = n;
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 1) {
                    System.out.print(j);
                }
                else {
                    System.out.print(a);
                    a--;
                }
            }
            System.out.println();
        }

    }
}


//enter a value :
//        5
//        12345
//        54321
//        12345
//        54321
//        12345