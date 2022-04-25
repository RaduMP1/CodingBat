package String3;

/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */

public class SameEnds {

    public static void main(String[] args) {
        System.out.println(sameEnds("abXSYab"));
    }

    public static String sameEnds(String string) {
        int middle1 = string.length() / 2;
        int middle2 = string.length() / 2;

        if (string.length() % 2 != 0) string = string.substring(0, middle1) + string.substring(middle1 + 1);

        String first = string.substring(0, middle1);
        String second = string.substring(middle2);

        while (!(first.equals(second))) {
            middle1--;
            first = string.substring(0, middle1);
            System.out.println("first is : " + first);
            middle2++;
            second = string.substring(middle2);
            System.out.println("second is: " + second);
        }
        return first;
    }

    //solution found online
    public String sameEnds2(String string) {
        int len = string.length();
        String fin = "";
        String tmp = "";

        for (int i = 0; i < len; i++) {
            tmp += string.charAt(i);
            int tmplen = tmp.length();
            if (i < len/2 && tmp.equals(string.substring(len - tmplen, len)))
                fin = tmp;
        }
        return fin;
    }
}




