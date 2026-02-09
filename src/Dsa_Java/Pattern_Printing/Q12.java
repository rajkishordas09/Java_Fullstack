package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = ac.nextInt();

        for (int i = 1; i<= n ; i++){
            for (int j = 1; j <= n; j++){
                if(i == j || (i + j == n + 1))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}


//enter a value :
//        5
//        *   *
//        * *
//        *
//        * *
//        *   *
