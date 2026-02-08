package CoreJava.Loop.while_loop;

import java.util.Scanner;

//binary to decimal
public class Q17 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number in binary format : ");
        int num = ac.nextInt();
         int i = 1;

         int sum = 0;
        while(num != 0){
          int  value = (num % 10) * i;
            sum += value;
            num /= 10;
            i *=2;
        }
        System.out.println("decimal is : "+ sum);
    }
}
