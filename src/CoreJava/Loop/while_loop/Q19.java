package CoreJava.Loop.while_loop;

import java.util.Scanner;
//prints all prime numbers in a given range.
public class Q19 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = ac.nextInt();
        System.out.println("enter 2nd number : ");
        int b = ac.nextInt();

        boolean flag;
        System.out.print(" prime numbers are : ");

        while (a <= b){
           if(a<=1) {
               a++;
               continue;
           }
         flag = true;
        for (int i = 2; i <= a / 2;i++  ){
             if(a % i == 0) {
                 flag = false;
                 break;
             }

        }
        if (flag)
            System.out.print(a + " ");

        a++;
        }
    }
}
