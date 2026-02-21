package CoreJava.Declaration_and_Access_Modifier.pkg3;
//import java.util.Date;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Date a = new Date();
        System.out.println(a.getClass().getName());
        //here we create reference because getClass() is non static method
        //explicit class import > Same class name present in current package > implicit class import
    }
}
