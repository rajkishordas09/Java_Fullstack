package Advance_Java.Assignments;

public class smallestSubstringPalindrome {
    public static void main(String[] args) {
        String s="malayalam";
        String smallPalindrome=s;
        for(int i=0;i<s.length();i++) {
            for(int j=i+3;j<=s.length();j++) {
                String  s1=s.substring(i,j);
                if(isPalindrom(s1)) {
                    if(s1.length()<smallPalindrome.length())
                        smallPalindrome=s1;
                }
            }
        }
        System.out.println(smallPalindrome);
    }
    public static boolean isPalindrom(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
