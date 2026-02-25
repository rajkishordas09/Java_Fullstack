package CoreJava.Modifiers.Final_Modifier.Method_and_Class.pkg1;

public final class Q2 {
    int a ;
    static int b ;
    public static void main(String[] args) {
        b = 200;
        System.out.println(b);

        Q2 q = new Q2();
        q.a = 100;
        System.out.println(q.a);
    }

    void m3(){
        System.out.println("autometic final method");
    }

    Q1 q = new Q1();

}

//if a class final then we cannt create child class
//if a class is final bydefault all method are final but every variable present inside final class not be final,