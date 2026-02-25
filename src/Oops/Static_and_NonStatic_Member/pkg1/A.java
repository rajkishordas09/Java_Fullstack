package Oops.Static_and_NonStatic_Member.pkg1;

public class A {
      int j;
      static void m(){
//          System.out.println(j);
      }
      void m1(){
          System.out.println(j);
      }

    public static void main(String[] args) {
        A a = new A();
        a.m1();

        a.j = 20;
        a.m1();

        A a2 = new A();
        a2.m1();

    }

}
