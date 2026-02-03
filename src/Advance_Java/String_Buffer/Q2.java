package Advance_Java.String_Buffer;

public class Q2 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("raj");
        StringBuffer sb2 = new StringBuffer("raj");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
    }
}
