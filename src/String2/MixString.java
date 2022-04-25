package String2;

/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a,
the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */

public class MixString {

    public static void main(String[] args) {
        System.out.println(mixString("Hi", "There"));
    }

    public static String mixString(String a, String b) {
        int min = Math.min(a.length(),b.length());
        String ab = "";
        for (int i = 0; i < min; i++) {
            ab = ab + a.charAt(i) + b.charAt(i);
        }
        System.out.println("ab: " + ab);
        System.out.println("a.substring(min): " + a.substring(min));
        System.out.println("b.substring(min): " + b.substring(min));
        return ab + a.substring(min) + b.substring(min);
    }

}

