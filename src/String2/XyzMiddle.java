package String2;

/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to
the left and right of the "xyz" must differ by at most one.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */

public class XyzMiddle {

    public static void main(String[] args) {
        System.out.println(xyzMiddle("1x345xyz12x4"));
    }

    public static boolean xyzMiddle(String str) {
        if (str.length() < 3) return false;

        int half = str.length()/2;
        boolean even = str.length() % 2 == 0;

        if (even) {
            return str.substring(half - 2, half + 1).equals("xyz") || str.substring(half - 1, half + 2).equals("xyz");
        } else {
            return str.substring(half-1, half+2).equals("xyz");
        }

    }
}
