package String2;

/*
Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear
somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 */

public class PrefixAgain {

    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabX", 3));
    }

    public static boolean prefixAgain(String str, int n) {
        String newStr = str.substring(0,n);
        System.out.println("newStr: " + newStr);
        for (int i = n; i <= str.length()-n; i++) {
            System.out.println("str.substring(i, i+n): " + str.substring(i, i+n));
            if (str.substring(i, i+n).equals(newStr)) return true;
        }
        return false;
    }
}
