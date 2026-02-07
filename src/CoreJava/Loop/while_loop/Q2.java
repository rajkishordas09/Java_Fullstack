package CoreJava.Loop.while_loop;

import java.util.Scanner;
//print fivonacci serise to n range
public class Q2 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter the range of fibonacci serise : ");
        int num = ac.nextInt();

        System.out.print("fibonacci serise to " + num +" range : ");

        int a = 0, b = 1, c = 0;
        while(a<=num){
            System.out.print(a + " ");
            c = a+b;
            a=b;b=c;
        }
    }
}
