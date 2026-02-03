package CoreJava.Flow_Control;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
       Scanner ac = new Scanner(System.in);
        System.out.println("enter a amount : ");
        int amount = ac.nextInt();
        System.out.println("amount is : " + amount);
        if(amount >= 2000){
            System.out.println("2000 are needed : " + (amount / 2000));
            amount %= 2000;
        }if(amount >= 500){
            System.out.println("500 are needed : " + (amount / 500));
            amount %= 500;
        }if(amount >= 200){
            System.out.println("200 are needed : " + (amount / 200));
            amount %= 200;
        }if(amount >= 100) {
            System.out.println("100 are needed : " + (amount / 100));
            amount %= 100;
        }

    }
}
