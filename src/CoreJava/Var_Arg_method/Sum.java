package CoreJava.Var_Arg_method;

public class Sum {
    public static void m(int... x ) {
        int sum =0;
        for(int i:x){
            sum+=i;
        }

        System.out.println(sum);
    }


    public static void main(String[] args) {
        m();
        m(10);
        m(10,20);
        m(10,20,30,40,50);
        m(new int []{1,2,4,7});
    }
}
