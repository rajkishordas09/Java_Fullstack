package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = ac.nextInt();

        for (int i = 1; i<= n ; i++){

            for (int j = n; j >= i; j--){
                System.out.print(j + " ");

            }
            System.out.println();
        }

    }
}

//enter a value :
//        5
//        5 4 3 2 1
//        5 4 3 2
//        5 4 3
//        5 4
//        5