package Advance_Java.Assignments;

public class stringNumber2 {
    public static void main(String[] args) {
        String s = "hello world";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') { res += ' '; continue; }
            int totalCount = 0;
            for (int j = 0; j < s.length(); j++)
                if (s.charAt(j) == ch) totalCount++;
            if (totalCount > 1) {
                int occCount = 0;
                for (int j = 0; j <= i; j++)
                    if (s.charAt(j) == ch) occCount++;
                res += occCount;
            } else {
                res += ch;
            }
        }
        System.out.println(res);
    }
}
