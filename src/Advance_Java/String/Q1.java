package Advance_Java.String;

public class Q1 {
    public static void main(String[] args) {
        String s1 = new String("Raj");

        s1.concat("kishor");
        System.out.println(s1);

        String s2 = s1.concat("kishor");
        System.out.println(s2);

        String s3= s1.concat(s2);
        System.out.println(s3);
    }
}
