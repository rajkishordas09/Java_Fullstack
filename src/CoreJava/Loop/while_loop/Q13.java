package CoreJava.Loop.while_loop;

import java.util.Scanner;

//lcm of two number
public class Q13 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = ac.nextInt();
        System.out.println("enter 2nd number : ");
        int b = ac.nextInt();
        int n= a >= b ? a : b;
        while(true){
            if( n % a == 0 && n % b == 0)
                break;
            n++;
        }

        System.out.println("lcm is : "+n);
    }
}
