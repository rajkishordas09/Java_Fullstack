package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = ac.nextInt();

        for (int i = 1; i<= n ; i++){
            int a = 1;
            for (int j = n; j >= i; j--){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

    }
}


//enter a value :
//        5
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
