package Dsa_Java.Pattern_Printing;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd value: ");
        int n = sc.nextInt();

        if (n % 2 == 0) n--;   // ensure odd for proper diamond

        int space = n / 2;

        // Upper part (including middle)
        for (int i = 1; i <= n; i += 2) {

            for (int j = 1; j <= space; j++)
                System.out.print(" ");

            int num = 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (j <= i / 2)
                    num++;
                else
                    num--;
            }

            System.out.println();
            space--;
        }

        space = 1;

        // Lower part
        for (int i = n - 2; i >= 1; i -= 2) {

            for (int j = 1; j <= space; j++)
                System.out.print(" ");

            int num = 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (j <= i / 2)
                    num++;
                else
                    num--;
            }

            System.out.println();
            space++;
        }
    }
}

//Enter odd value: 9
//            1
//           121
//          12321
//         1234321
//        123454321
//         1234321
//          12321
//           121
//            1