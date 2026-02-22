package CoreJava.Modifiers.Abstract_Modifier.pkg3;

public class Q2 extends Q1{
    public static void main(String[] args) {
        Q2 q = new Q2();
        q.m();
        q.m1();
    }

    @Override
   public void m() {
        System.out.println("hiii");
    }

    @Override
    public void m1() {
        System.out.println("hello");
    }
}

//When overriding:
//
//You cannot reduce visibility
//
//You can keep same visibility
//
//You can increase visibility
