package CoreJava.Loop.while_loop;

import java.util.Scanner;

//print gcd of a number
public class Q10 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println(" enter  a number : ");
        int a = ac.nextInt();
        System.out.println("enter 2nd number : ");
        int b = ac.nextInt();
        int rem;
        while (b != 0){
           rem = a % b;
           a = b;
           b = rem;
        }
        System.out.println("gcd is : "+a);
    }
}
