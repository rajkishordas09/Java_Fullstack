package CoreJava.Loop.while_loop;

import java.util.Scanner;

//armstrong number
public class Q8 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = ac.nextInt();
        int n = num;
        int sum = 0;
        while (n != 0){
            sum += (int)Math.pow((n % 10), 3); // return double and store in int
            n /= 10;
        }
        if(num == sum)
            System.out.println(num +" is a armstrong number");
        else  System.out.println(num +" is not a armstrong number");
    }
}
