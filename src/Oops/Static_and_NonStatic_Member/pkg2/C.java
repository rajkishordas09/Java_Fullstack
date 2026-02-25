package Oops.Static_and_NonStatic_Member.pkg2;

public class C {
    static int i;
    int j;

    void increment(){
        ++i;
        ++j;
    }
    void display(){
        System.out.println(i+"    "+j);
    }

    public static void main(String[] args) {
        C c1 = new C();
        C c2 = new C();
        C c3 = new C();

        c1.increment();
        c2.increment();
        c3.increment();

        c1.display();
        c2.display();
        c3.display();
    }
}
