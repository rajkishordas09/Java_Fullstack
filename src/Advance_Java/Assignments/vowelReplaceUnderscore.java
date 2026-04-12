package Advance_Java.Assignments;

public class vowelReplaceUnderscore {
    public static void main(String[] args) {
        String s="india";
        String res="";
        String vowels="aeiou";
        int count=0;
        for(int i=0;i<s.length();i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                count++;
            }
        }
        if (count > 2) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (vowels.contains(String.valueOf(ch))) {
                    res += "_";
                } else {
                    res += ch;
                }
            }

            System.out.println("Replaced String:"+res);
        } else {
            System.out.println("Less than or equal to 2 vowels");
        }
    }
}
