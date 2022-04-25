package Warmup2;

/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */

public class StringMatch {

    public static void main(String[] args) {
        System.out.println(stringMatch("abc", "abc"));
    }

    public static int stringMatch(String a, String b) {
        String newA = "";
        String newB = "";
        int counter = 0;
        for (int i = 0; i < Math.min(a.length(), b.length())-1; i++) {
            newA = a.substring(i,i+2);
            newB = b.substring(i,i+2);
            System.out.println(newA + "--" + newB);
            if (newA.equals(newB)) counter++;
        }
        return counter;
    }
}
