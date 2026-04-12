package Advance_Java.Assignments;

public class anagramRecursion {
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";
        if(anagram(s1,s2)) {
            System.out.println("anagram");
        }
        else {
            System.out.println("not anagram");
        }
    }
    public static boolean anagram(String s1,String s2) {
        if(s1.length()!=s2.length())
            return false;
        if(s1.length()==0 && s2.length()==0)
            return true;
        char ch = s1.charAt(0);
        int index = s2.indexOf(ch);
        if(index==-1) return false;
        return anagram(
                s1.substring(1),
                s2.substring(0, index) + s2.substring(index + 1));
    }
}
