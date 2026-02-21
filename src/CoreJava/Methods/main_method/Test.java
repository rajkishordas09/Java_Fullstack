package CoreJava.Methods.main_method;

 class Test {
    public static void main(String[] args){
        System.out.println("parent class");
    }
}
class A extends Test{
    public static void main(String[] args){
        System.out.println("child class");
    }
}

