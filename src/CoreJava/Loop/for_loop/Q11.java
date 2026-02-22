package CoreJava.Loop.for_loop;

import java.util.Scanner;
//fibonacci serice
public class Q11 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter the row : ");
        int n = ac.nextInt();
        int a = 0 , b = 1, c;
        for(int i = 1;i <= n;i++){
            for (int j = 1; j <= i; j++){
                System.out.print(a + "\t");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

    }
}


//        enter the row :
//        5
//        0
//        1	1
//        2	3	5
//        8	13	21	34
//        55 89	144	233	377