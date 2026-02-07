package CoreJava.Loop.while_loop;

import java.util.Scanner;
//repeated sum of digits until a single-digit number is obtained. == digitalRoot = 1 + (n - 1) % 9
public class Q6 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = ac.nextInt();
        int sum =num;
        while (num > 9) {
            sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

                num = sum ;

        }
        System.out.println("sum is : "+sum);

    }
}
