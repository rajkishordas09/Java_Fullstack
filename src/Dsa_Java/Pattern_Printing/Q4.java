package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a num : ");
        int num = ac.nextInt();

        for (int i =1;i<=num;i++){
//            char c=65;
            for(int j =1;j<=num;j++){
                System.out.print((char)(j+64) + " ");
//                c++;
            }
            System.out.println();
        }
    }
}


//enter a num :
//        5
//A B C D E
//A B C D E
//A B C D E
//A B C D E
//A B C D E