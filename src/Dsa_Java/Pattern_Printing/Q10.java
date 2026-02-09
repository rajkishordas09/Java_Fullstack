package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = ac.nextInt();

        for (int i = 1; i<= n ; i++){
            int a = 1;
            for (int j = n; j >= i; j--){
                System.out.print(a );
                if(j > i)
                    System.out.print(" * ");
                a++;
            }
            System.out.println();
        }

    }
}
