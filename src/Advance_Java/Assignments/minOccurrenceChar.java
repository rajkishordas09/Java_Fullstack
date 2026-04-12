package Advance_Java.Assignments;

public class minOccurrenceChar {
    public static void main(String[] args) {
        String s="jaaavva";
        s=s.toLowerCase();
        int mincount=Integer.MAX_VALUE;
        char minchar=' ';
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
                minchar=ch;
            }
        }

        System.out.println("Min occurred char:"+minchar);
        System.out.println("min count:"+mincount);


    }
}
