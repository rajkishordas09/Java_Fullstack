package Exception.CheckedException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class A {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("hell");
//        System.out.println(10/0);
    }
}
