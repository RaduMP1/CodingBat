package String1;

/*
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */

public class NonStart {

    public static void main(String[] args) {
        System.out.println(nonStart("H", "There"));
    }

    public static String nonStart(String a, String b) {
        System.out.println(a.substring(1));
        System.out.println(b.substring(1));

        return a.substring(1) + b.substring(1);
    }
}

/*
Note. If string length is 1, and I ask substring(1) it will return an empty String "", not throw IndexOutOfBoundsException (it will only throw the exception if requesting from substring(2)...)
 */