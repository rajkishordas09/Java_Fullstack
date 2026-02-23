package CoreJava.Modifiers.Private_Modifier;

 class Q1 {
    void m(){
        System.out.println("hii");
    }

    private void m1(){
        System.out.println("hiii");
    }


}
class P extends Q1{

    @Override
    void m() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        P p = new P();
        p.m();
//        p.m1(); // we cannt access outside of same class

        Q1 q = new Q1();
        q.m();
//        q.m1();

    }

}
