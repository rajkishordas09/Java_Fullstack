package CoreJava.Loop.for_loop;

import java.util.Scanner;

//print 1st n numbers of fibonacci serise
public class Q8 {
    public static void main(String[] args) {
        Scanner ac= new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = ac.nextInt();
        int a = 0, b= 1, c;
        System.out.print("1st "+num+" numbers of fibonacci serise : ");
        for(int i = 1; i <= num; i++){

            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }
}
