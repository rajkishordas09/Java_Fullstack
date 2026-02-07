package CoreJava.Loop.while_loop;

import java.util.Scanner;

//strong number == sum of factorial of each digit
public class Q7 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter a number  :");
        int num = ac.nextInt();
        int n = num;
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            int i = 1;
            int fact = 1;
            while (i<= rem){
                fact *= i;
                i++;
            }
            num /= 10;
            sum += fact;
        }
        if(n == sum)
            System.out.println(n + " is a strong number");
        else System.out.println(n+ " is not a strong number");
    }
}
