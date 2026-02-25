package Oops.Static_and_NonStatic_Member.pkg1;

public class B {
    static int a;
    void m1(){
        System.out.println(a);
    }
    static void m2(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        B.m2();

        B q = new B();
        q.m1();
        a=20;

        q.m1();
        B.m2();
    }
}
