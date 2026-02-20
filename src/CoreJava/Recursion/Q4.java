package CoreJava.Recursion;

public class Q4 {
    public static void main(String[] args) {
        m(1);
    }

    public static void m(int i) {
        System.out.println(i);
        if(i % 3 == 0)
            return;
        m(i++);
        System.out.println(i);

    }
}
