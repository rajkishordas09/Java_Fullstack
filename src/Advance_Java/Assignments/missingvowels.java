package Advance_Java.Assignments;

public class missingvowels {
    public static void main(String[] args) {
        String s1="india";
        s1=s1.toLowerCase();
        String vowels="aeiou";
        for (int i=0;i<vowels.length();i++) {
            char ch=vowels.charAt(i);
            if(! s1.contains(String.valueOf(ch))) {
                System.out.println(ch);
            }
        }
    }
}
