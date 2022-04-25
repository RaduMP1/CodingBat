package Recursion1;

/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
 */

public class CountAbc {

    public static void main(String[] args) {
        System.out.println(countAbc("abcdef"));
    }

    public static int countAbc(String str) {
        if (str.length() < 3) return 0;
        if (str.substring(0,3).equals("aba") || str.substring(0,3).equals("abc")) return 1 + countAbc(str.substring(1));
        return countAbc(str.substring(1));
    }
}
