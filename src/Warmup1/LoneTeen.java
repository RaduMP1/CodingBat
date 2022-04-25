package Warmup1;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
 */

public class LoneTeen {

    public static void main(String[] args) {
        System.out.println(loneTeen(14, 13));
    }

    public static boolean loneTeen(int a, int b) {
        return ((a >= 13 && a <= 19) && !(b >= 13 && b <= 19)) || (!(a >= 13 && a <= 19) && (b >= 13 && b <= 19));
    }

    /*
    solutia lor -- mai usor de citit:
    public boolean loneTeen(int a, int b) {

    boolean aTeen = (a >= 13 && a <= 19);
    boolean bTeen = (b >= 13 && b <= 19);

    return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
    */
}
