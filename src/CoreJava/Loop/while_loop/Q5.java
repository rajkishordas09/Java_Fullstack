package CoreJava.Loop.while_loop;

import java.util.Scanner;

//sum of digits of a number
public class Q5 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = ac.nextInt();
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum = "+sum);
    }
}
