package CoreJava.Loop.while_loop;

import java.util.Scanner;

// 2nd highest prime number between the range
public class Q21 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = ac.nextInt();
        System.out.println("enter 2nd number : ");
        int b = ac.nextInt();

        int count = 0;
        boolean flag;
        System.out.print("2nd highest prime numbers is : ");

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
                count++;
                if (count == 2) {
                    System.out.print(b + " ");
                    break;
                }
            }
            b--;
        }
    }
}
