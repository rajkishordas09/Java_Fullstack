package CoreJava.Scanner_Class;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num and text");
        int num = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("num = " + num );
        System.out.println( "text = " + s);
    }
}
