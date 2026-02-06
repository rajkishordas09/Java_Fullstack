package CoreJava.Loop.for_loop;

import java.util.Scanner;

//Factorial of a number
public class Q4 {
    public static void main(String[] args) {
        Scanner ac =  new Scanner(System.in);
        System.out.println("enter a num : ");
        int num = ac.nextInt();

        int fact = 1;
        for(int i =1;i<=num;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
