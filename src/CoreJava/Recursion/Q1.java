package CoreJava.Recursion;

public class Q1 {
    public static void main(String[] args) {
        m(1);
    }

    public static void m(int i) {
        System.out.println(i);
        if(i % 3 == 0)
            return;
        m(i+1);
        System.out.println("method end");

    }
}
