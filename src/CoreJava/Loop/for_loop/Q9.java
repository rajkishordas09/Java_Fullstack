package CoreJava.Loop.for_loop;

import java.util.Scanner;
// sum of 1st n numbers of fibonacci serise
public class Q9 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = ac.nextInt();
        int a = 0, b = 1, c;
        int sum = 0;
        System.out.print("1st "+num+" numbers of fibonacci serise : ");
        for (int i = 1;i <= num; i++){
            System.out.print(a+ " ");
            sum += a;
            c= a + b;
            a = b;
            b = c;
        }
        System.out.println();
        System.out.println("sum of 1st "+num+" numbers of fibonacci serise is : "+ sum);
    }
}
