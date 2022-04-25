package String2;

/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */

public class EndOther {

    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
    }

    public static boolean endOther(String a, String b) {
        String x = a.toLowerCase();
        String y = b.toLowerCase();

        return x.endsWith(y) || y.endsWith(x);

//        older version ------
//        if (x.length() > y.length()) return x.substring(x.length()-y.length()).equals(y);
//        return y.substring(y.length()-x.length()).equals(x);
    }
}
