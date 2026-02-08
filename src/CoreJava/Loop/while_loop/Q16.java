package CoreJava.Loop.while_loop;

import java.util.Scanner;
//palindrome
public class Q16
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = ac.nextInt();
        int n = num;
        int rev = 0;
        while (n != 0){
            rev= rev * 10 + n % 10;
            n /= 10;
        }
        if(rev == num )
            System.out.println("Number is palindrome ");
        else System.out.println("Number is not palindrome ");
    }
}
