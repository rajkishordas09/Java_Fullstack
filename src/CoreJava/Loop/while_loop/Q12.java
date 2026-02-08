package CoreJava.Loop.while_loop;

import java.util.Scanner;
//lcm of two number
public class Q12 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("enter a number : ");
        int a = ac.nextInt();
        System.out.println("enter 2nd number : ");
        int b = ac.nextInt();

      int c = a* b;

      while(b !=0){
          int rem = a % b;
          a = b;
          b = rem;
      }
      int lcm = c / a;
        System.out.println("lcm is : "+ lcm);

    }
}
