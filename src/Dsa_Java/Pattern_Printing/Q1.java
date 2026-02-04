package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

//
public  class Q1 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter rows and colmns : ");
        int row = ac.nextInt();
        int col = ac.nextInt();
        for (int i = 1;i <= row; i++){
            for( int j = 1; j <= col; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
