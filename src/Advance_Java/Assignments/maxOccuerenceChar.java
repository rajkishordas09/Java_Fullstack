package Advance_Java.Assignments;

public class maxOccuerenceChar {
    public static void main(String[] args) {
        String s="jaaavva";
        s=s.toLowerCase();
        int maxcount=0;
        char maxchar=' ';
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
                maxchar=ch;
            }
        }

        System.out.println("Max occurred char:"+maxchar);
        System.out.println("max count:"+maxcount);
    }
}
