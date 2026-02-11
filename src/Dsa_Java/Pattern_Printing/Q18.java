package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = ac.nextInt();
        int space = n - 1;
        int star = 1;
        for (int i = 1; i<= n ; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {

                System.out.print("*");
            }
            System.out.println();
            space--;
            star +=2;
        }
    }
}
