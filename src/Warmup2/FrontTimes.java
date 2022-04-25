package Warmup2;

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {

    public static void main(String[] args) {
        System.out.println(frontTimes("a", 3));
        System.out.println(newVersionFrontTimes("Chocolate", 4));
    }

    public static String frontTimes(String str, int n) {
        String frontStr = "";
        for (int i = 0; i < n; i++) {
            if (str.length() <= 3) {
                frontStr += str;
            } else {
                frontStr += str.substring(0, 3);
            }
        }
        return frontStr;
    }

    public static String newVersionFrontTimes(String str, int n) {
        if (str.length()<=3) {
            return str.repeat(n);
        } else {
            return str.substring(0,3).repeat(n);
        }
    }
}
