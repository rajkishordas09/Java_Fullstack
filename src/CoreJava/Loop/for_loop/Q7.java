package CoreJava.Loop.for_loop;

import java.util.Scanner;

//check perfect number or not == sum of factors of given num escept the given number
public class Q7 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = ac.nextInt();
        int sum = 0;

        if(num<=0){
            System.out.println("perfect number is defined for positive number only");
            return;
        }

        for (int i = 1;i <= num/2;i++){
            if(num % i ==0)
                sum += i;
        }
        if (sum == num)
            System.out.println(num+" is perfect number");
        else System.out.println(num + " is not a perfect number");
    }
}
