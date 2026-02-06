package CoreJava.Loop.for_loop;

import java.util.Scanner;
//print fibonacci number between the range
public class Q10 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int m = ac.nextInt();
        System.out.println("enter a number : ");
        int n = ac.nextInt();

        int a = 0, b = 1, c;

        for (int i = 1;i <= n;i++){

            if(a >= m && a <= n)
                System.out.print( a+ " ");
            c = a + b;
            a = b;
            b = c;

        }


    }
}
