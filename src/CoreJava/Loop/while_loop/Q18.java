package CoreJava.Loop.while_loop;

import java.util.Scanner;
//decimal to binary
public class Q18 {
    public static void main(String[] args) {
    Scanner ac = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = ac.nextInt();
        int binary = 0;
        int i = 1;
      while (num != 0){

          int bit = num % 2;
          binary = (bit * i) + binary;
          num /= 2;
          i *= 10;
      }
        System.out.println("binary is : "+binary);


    }


}
