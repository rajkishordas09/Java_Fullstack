package CoreJava.Modifiers.Final_Modifier.Variables.Final_instance_Variables;

public class Q1 {
    final int a = 20;

    void m1(){
        System.out.println(a);
    }
    static void m2(){
//        System.out.println(a);  //error
    }

    public static void main(String[] args) {
        Q1 q = new Q1();
//        q.a= 20;
        System.out.println(q.a);

        q.m1();
    }
}
