package Advance_Java.Assignments;

public class swapString {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        a = a + b;   // HelloWorld
        b = a.substring(0, a.length() - b.length()); // Hello
        a = a.substring(b.length()); // World

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
