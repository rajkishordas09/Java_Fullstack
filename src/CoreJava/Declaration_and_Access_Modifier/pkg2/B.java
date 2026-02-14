package CoreJava.Declaration_and_Access_Modifier.pkg2;

import CoreJava.Declaration_and_Access_Modifier.pkg1.A;


 class B {
    public static void main(String[] args) {
        A a1=new A();
        a1.m1();

        B b = new B();
        b.m1();
        b.m2();
        m3();

    }
     void m1(){
        System.out.println("hello m1 ");

    }
    public void m2(){
        System.out.println("hello m2 ");

    }  public static  void m3(){
        System.out.println("hello m3 ");

    }
}
