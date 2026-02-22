package CoreJava.Import.pkg3;
//import java.util.Date;

public class Q2 {
    public static void main(String[] args) {
        Date a = new Date();
        System.out.println(a.getClass().getName());
        System.out.println(a);
        //here we create reference because getClass() is non static method
        //explicit class import > Same class name present in current package > implicit class import
    }
}
