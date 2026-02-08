package CoreJava.Loop.while_loop;

import java.util.Scanner;

//reverse a number
public class Q14 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = ac.nextInt();
        int rev = 0;
        while (num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(rev);
    }
}
