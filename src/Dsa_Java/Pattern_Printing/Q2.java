package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a num : ");
        int n = ac.nextInt();
        for (int i = 1;i<= n;i++){
            for (int j = 1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
