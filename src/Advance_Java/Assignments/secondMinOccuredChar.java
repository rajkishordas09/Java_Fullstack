package Advance_Java.Assignments;

public class secondMinOccuredChar {
    public static void main(String[] args) {
        String s="jaaavva";
        s=s.toLowerCase();
        int mincount=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            int count=0;
            for (int j=0;j<s.length();j++) {
                if(ch==s.charAt(j)) {
                    count++;
                }
            }
            if(count<mincount) {
                mincount=count;
            }
        }
        int secondmin=Integer.MAX_VALUE;
        char secondchar=' ' ;
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            int count=0;
            for (int j=0;j<s.length();j++) {
                if(ch==s.charAt(j)) {
                    count++;
                }
            }
            if(count>mincount && count<secondmin) {
                secondmin=count;
                secondchar=ch;
            }
        }
        System.out.println("Second min occurred char:"+secondchar);
        System.out.println("secondmin count:"+secondmin);

    }
}
