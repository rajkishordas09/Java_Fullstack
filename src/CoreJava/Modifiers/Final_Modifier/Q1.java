package CoreJava.Modifiers.Final_Modifier;

 class Q1 {
    final void m1(){
         System.out.println("hii");
     }
    static void m2() {
         System.out.println("hello");
     }
}

class A extends Q1{
    public static void main(String[] args) {
      m2();
     A a = new A();
     a.m1();

     Q1 q = new Q1();
     q.m1();

     Q1 q2 = new A();//child class object create
     q2.m1();
    }

//    @Override
//    void m1() {
//        System.out.println("raj");
//    }
}