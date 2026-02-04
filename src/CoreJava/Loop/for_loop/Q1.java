package CoreJava.Loop.for_loop;

import java.util.Scanner;

//Factorial Number
public class Q1 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = ac.nextInt();
        int fact = 1;
        for (int i = 1; i<=num; i++)
            fact *= i;
        System.out.println("Factorial of " + num + " is : " + fact);
    }
}
