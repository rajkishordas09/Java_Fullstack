package CoreJava.Flow_Control;
import java.util.Scanner;
//leap year
public class Q6 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter year : ");
        int year= ac.nextInt();
        if((year % 4 == 0  && year % 100 != 0) || year % 400 == 0 )
            System.out.println("leap year");
        else System.out.println("not leap year");
    }
}
