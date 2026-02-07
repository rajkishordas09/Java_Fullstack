package CoreJava.Loop.while_loop;

import java.util.Scanner;

//check number is automorphic or not
public class Q4 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = ac.nextInt();
        int n = num;
        boolean flag = true;
        int square = num * num;
        while(num != 0){
            if(num % 10 != square % 10){
                flag = false;
                break;
            }
            num /= 10;
            square /= 10;
        }
        if (flag)
            System.out.println(n + " is automorphic");
        else  System.out.println(n + " is not automorphic");
    }
}
