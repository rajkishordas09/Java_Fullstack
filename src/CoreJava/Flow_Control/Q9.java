package CoreJava.Flow_Control;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
         Scanner ac = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = ac.nextInt();
        System.out.println("enter month in number : ");
        int month = ac.nextInt();
         switch (month){
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
                 System.out.println( month + " / "+year+ " : is 31 days");
                 break;
             case 4:
             case 6:
             case 9:
             case 11:
                 System.out.println(month + " / "+year+ " : is 30 days");
                 break;
             case 2:
                 String s = "Leap year";
                 if((year % 4 == 0 && year %100 != 0) || year % 400 ==0)
                  System.out.println(month + " / "+year+ " : is 29 days and " + s);
                 else System.out.println(month + " / "+year+ " : is 28 days");
                 break;
             default:
                 System.out.println("Invalid input ");
         }
    }
}
