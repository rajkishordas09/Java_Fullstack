package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a num : ");
        int num = ac.nextInt();
        for(int i = 1;i<= num;i++){
            for(int j = 1;j<=num;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


//5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5