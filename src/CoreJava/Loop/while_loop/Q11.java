package CoreJava.Loop.while_loop;

import java.util.Scanner;
//gcd
public class Q11 {
    public static void main(String[] args) {

    Scanner ac = new Scanner(System.in);
        System.out.println("enter a number :");
        int a= ac.nextInt();
        System.out.println("enter 2nd number : ");
        int b = ac.nextInt();

        int n = Math.min(a,b);
        while(true){
            if(a % n == 0 && b % n == 0)
                break;
            n--;
        }
        System.out.println("gcd is : "+n);

    }

}
