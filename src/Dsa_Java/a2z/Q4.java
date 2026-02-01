package Dsa_Java.a2z;
//Write a Java program to find the Greatest Common Divisor (GCD) or Highest Common Factor (HCF) of two given numbers.
public class Q4 {
    public static void main(String[] args) {
        System.out.println(m1(40, 96));
        System.out.println(m1(90, 27));
    }
    public static int m1(int a, int b) {
        int rem;
        while (b != 0) {
            rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}


//Explanation:
//        1. The program takes two integer inputs from the user.
//2. The findGCD method uses the Euclidean algorithm to compute the GCD.
//o Itrepeatedly replaces a with b and b with a % b until b becomes 0.
//o Thefinal value of a is the GCD.
//        3. The program prints the computed GCD (HCF).