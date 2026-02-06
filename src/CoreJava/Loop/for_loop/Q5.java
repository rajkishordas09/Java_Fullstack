package CoreJava.Loop.for_loop;

import java.util.Scanner;

//prime number
public class Q5 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a num : ");
        int num = ac.nextInt();
        if(num < 2){
            System.out.println("not a prime number");
            return;
        }
//        for (int i = 2; i * i <= num; i++) also valid
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0) {
                System.out.println("not a prime number ");
                return;
            }

        }
        System.out.println("prime number ");
    }
}
