package Advance_Java.Assignments;

public class secondMaxOccuredChar {
    public static void main(String[] args) {
        String s="jaaavva";
        s=s.toLowerCase();
        int maxcount=0;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            int count=0;
            for (int j=0;j<s.length();j++) {
                if(ch==s.charAt(j)) {
                    count++;
                }
            }
            if(count>maxcount) {
                maxcount=count;
            }
        }
        int secondmax=0;
        char secondchar=' ' ;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            int count=0;
            for (int j=0;j<s.length();j++) {
                if(ch==s.charAt(j)) {
                    count++;
                }
            }
            if(count>secondmax && count<maxcount) {
                secondmax=count;
                secondchar=ch;
            }
        }
        System.out.println("Second Max occurred char:"+secondchar);
        System.out.println("secondmax count:"+secondmax);
    }
}
