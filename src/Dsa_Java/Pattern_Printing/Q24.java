package Dsa_Java.Pattern_Printing;

import java.util.Scanner;
//hollow diamond with diagonal
public class Q24 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = ac.nextInt();
        int space = n/2;
        int star = 1;
        for (int i = 1; i<= n;i++){
            for (int j =1;j <= space;j++){
                System.out.print(" ");
            }
            for (int  j = 1;j <= star; j++){
                if(j == 1 || j == star || i == n/2+1 || j == star/2+1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
            if(i <= n/2){
                space--;
                star+=2;
            }
            else {
                space++;
                star-=2;
            }
        }
    }
}
