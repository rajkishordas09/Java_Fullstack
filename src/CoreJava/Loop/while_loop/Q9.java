package CoreJava.Loop.while_loop;

import java.util.Scanner;
// print all armstrong number in a given range
public class Q9 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter the starting range :");
        int a = ac.nextInt();
        System.out.println("enter the a ending range : ");
        int b = ac.nextInt();



        System.out.print("armstrong number are : ");
        while(a <= b){
            int temp = a;
            int count = 0;
            while(temp != 0){
                count++;
                temp /= 10;
            }

            int sum = 0;
            temp = a;
            while(temp != 0){
                sum += (int)Math.pow((temp % 10),count);
                temp /= 10;
            }

            if(sum == a)
                System.out.print(a + " ");
            a++;
        }



    }
}
