package Advance_Java.String_Buffer;

public class Q1 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Raj");

        sb1.append("kishor");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("Das");
        sb1.append(sb2);
        System.out.println(sb2);
    }
}
