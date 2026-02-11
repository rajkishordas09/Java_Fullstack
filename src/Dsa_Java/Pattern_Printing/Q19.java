package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = ac.nextInt();
        int space = n - 1;

        for (int i = 1; i<= n ; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {

                System.out.print(j);
            }
            System.out.println();
            space--;

        }
    }
}
