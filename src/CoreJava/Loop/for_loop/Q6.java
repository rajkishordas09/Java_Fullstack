package CoreJava.Loop.for_loop;

import java.util.Scanner;

//count the number of prime numbers present and print all prime number
public class Q6 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter the range of num from 2 to onwords : ");
        int num = ac.nextInt();
        int count = 0;

        System.out.print(" prime numbers are :");
        for (int i = 2; i <= num; i++){
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++){
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("total prime numbers are : "+count);
    }
}
