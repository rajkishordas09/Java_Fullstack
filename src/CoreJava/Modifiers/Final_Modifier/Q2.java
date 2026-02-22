package CoreJava.Modifiers.Final_Modifier;

public final class Q2 {
    int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        b = 200;
        System.out.println(b);

        Q2 q = new Q2();
        q.a = 100;
        System.out.println(q.a);
    }
}
//if a class final then we cannt create child class
//if a class is final bydefault all method are final but every variable present inside final class not be final,