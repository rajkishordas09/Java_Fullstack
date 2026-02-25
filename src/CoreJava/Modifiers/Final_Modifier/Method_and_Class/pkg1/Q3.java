package CoreJava.Modifiers.Final_Modifier.Method_and_Class.pkg1;

public class Q3 {
    public static void main(String[] args) {
        Q2 q = new Q2();
        q.a = 300;
        System.out.println(q.a);

//        Q2.b = 345;
        System.out.println(Q2.b);

        q.m3();   //final method access everywhere but cannt override

    }
}
