package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = ac.nextInt();

        int num = 1;   // separate variable for printing

        for (int i = 1; i <= n; i++) {

            int start = num;

            if (i % 2 == 0) {
                start = num + i - 1;
            }

            for (int j = 1; j <= i; j++) {

                if (i % 2 != 0) {
                    System.out.print(start + "\t");
                    start++;
                } else {
                    System.out.print(start + "\t");
                    start--;
                }
            }

            num += i;
            System.out.println();
        }
    }
}
