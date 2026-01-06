package CoreJava.TypeOfVariable;

public class InstanceVariable {
    int x=10;
    public static void main(String[] args) {
//       System.out.println(x);   //error
        InstanceVariable i=new InstanceVariable();
        System.out.println(i.x);
//        System.out.println(InstanceVariable.x);

}
  public void main1(){

        System.out.println(x);
    }

}
