package CoreJava.Loop.for_loop;

import java.util.Scanner;

//factors of a number
public class Q3 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = ac.nextInt();
        System.out.print("factors of " + n+ " are :");
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                System.out.print(i + " ");
        }
    }
}
