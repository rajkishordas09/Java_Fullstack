package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = ac.nextInt();

        for (int i = 1; i<= n ; i++){

            for (int j = n; j >= 1; j--){

                if (j > i) {
                    System.out.print(" ");
                }
                else System.out.print("*");
            }
            System.out.println();
        }

    }
}


//enter a value :
//        5
//        *
//       **
//      ***
//     ****
//    *****