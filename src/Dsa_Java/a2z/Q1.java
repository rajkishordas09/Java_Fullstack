package Dsa_Java.a2z;
//Write a Java program to count the number of digits in a given integer.
public class Q1 {
    public static void main(String[] args) {
        int a=-4521233;
        int num=Math.abs(a);
        int size=String.valueOf(num).length();//It converts a number (or any primitive value) into a String.
        System.out.println(size+"\n-------------");

        int s=Integer.toString(num).length();
        System.out.println(s+"\n-------------");
        m1();
    }

    public static void m1() {
        int num = 456;
        String s = String.valueOf(num);

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }

}
