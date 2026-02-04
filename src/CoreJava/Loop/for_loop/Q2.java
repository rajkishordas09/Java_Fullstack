package CoreJava.Loop.for_loop;

import java.util.Scanner;

//write a program for discount of products so that every 3 items get extra 1 item
public class Q2 {
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);
        System.out.println("Enter the quantity of products buy : ");
        int num = ac.nextInt();
        int offer = 0;
        for (int i = 1; i<=num;i++)
            if(i % 3 == 0)
                offer += 1;
        System.out.println(" total number of products get : "+ (num + offer));

    }
}
