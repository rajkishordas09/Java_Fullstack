package CoreJava.Loop.while_loop;

import java.util.Scanner;

//fibonacci serise
public class Q1 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a num : ");
             int num = ac.nextInt();
             int a = 0, b = 1, c;
             int i = 1;
        System.out.print("fivonacci serise is : ");
             while(i <= num){
                 System.out.print(a+ " ");
                 c = a + b;
                 a = b;
                 b = c;
                 i++;
             }
    }
}
