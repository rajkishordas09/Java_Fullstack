package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = ac.nextInt();
        int a = 1;
        for (int i = 1; i<= n ; i++){

            for (int j = 1; j <= n; j++){
                if(i == j || (i + j == n + 1)) {
                    if (i == a || (i + j == n + 1))
                        System.out.print(a);
                }

                else System.out.print(" ");
            }
            a++;
            System.out.println();
        }

    }
}


//enter a value :
//        5
//        1   1
//         2 2
//          3
//         4 4
//        5   5
