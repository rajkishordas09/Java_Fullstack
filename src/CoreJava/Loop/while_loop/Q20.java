package CoreJava.Loop.while_loop;

import java.util.Scanner;

//print highest prime number in given range
public class Q20 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = ac.nextInt();
        System.out.println("enter 2nd number : ");
        int b = ac.nextInt();

        boolean flag;
        System.out.print("highest prime numbers is : ");

        while (b >= a){
            if(b<=1) {
                b--;
                continue;
            }
            flag = true;
            for (int i = 2; i <= b / 2;i++  ){
                if(b % i == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                System.out.print(b + " ");
                break;
            }
            b--;
        }
    }
}
