package Dsa_Java.a2z;
//Write a Java program to check whether a given integer is a palindrome.
public class Q3 {
    public static void main(String[] args) {
        System.out.println(m1(121));
        System.out.println(m1(-121));
        System.out.println(m1(1245));
        System.out.println(m1(444));
    }

    public static boolean m1(int num) {
        int rev = 0;
        int temp = num;
        if(num>0) {
            while (temp != 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            if(rev == num)
                return true;
            else  return false;
        }

        return false;
    }
}
