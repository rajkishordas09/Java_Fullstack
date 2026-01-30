package Dsa_Java.a2z;
//Write a Java program to reverse a given integer.
public class Q2 {
    public static void main(String[] args) {
     int reversed= m1(3654);
        System.out.println(reversed+"\n-----------------------");
        System.out.println(m1(-3654));;

    }

    public static int m1(int num) {
        int reversed = 0;
        while(num != 0){
            reversed = reversed * 10 + num % 10;
           // System.out.println(reversed);
            num /= 10;
        }
        return reversed;
    }
}
