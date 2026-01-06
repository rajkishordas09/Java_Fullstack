package CoreJava.Var_Arg_method;

public class Test {
    public static void m(int... x ) {
     System.out.println(x);
     System.out.println(x.length);
     System.out.println();
    }


    public static void main(String[] args) {
     m();
     m(10);
     m(10,20);
     m(10,20,30);
     m(10,20,30,40);
     m(10,20,30,40,50);
    }
}
