package CoreJava.Modifiers.Protected_Modifier.pkg2;

import CoreJava.Modifiers.Protected_Modifier.pkg1.Q1;

class P1 extends Q1 {
    public static void main(String[] args) {
        Q1 q = new Q1();
//    q.m1();
        Q1.m2();

        P1 p = new P1();
        p.m1();

        P1.m2();

    }


}
