package CoreJava.Scanner_Class;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter num and text");
        int num = sc.nextInt();
        String s = sc.nextLine();
        System.out.println("num = " + num );
        System.out.println( "text = " + s);
    }
}
