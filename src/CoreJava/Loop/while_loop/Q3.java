package CoreJava.Loop.while_loop;

import java.util.Scanner;
//print fibonacci serise between the range
public class Q3 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter the starting range of fibonacci serise : ");
        int num = ac.nextInt();
        System.out.println("enter the ending range of fibonacci serise : ");
        int num1 = ac.nextInt();
        System.out.print("fibonacci serise from "+num+" to " + num1 +" range : ");

        int a = 0, b = 1, c ;

        while(a <= num1){
            if(a >= num)
                System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;

        }
    }
}
