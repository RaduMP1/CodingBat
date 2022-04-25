package String3;

/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string, and at the very end of the string
in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */

public class MirrorEnds {

    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
    }

    public static String mirrorEnds(String string) {

        String revertString = "";
        String fin = "";

        for (int i = 0; i < string.length(); i++) {
            int reverti = string.length() - 1 - i;
            fin += string.charAt(i);
            revertString += string.charAt(reverti);
            if (!(fin.equals(revertString))) {
                fin = fin.substring(0, fin.length() - 1);
                break;
            }
        }
        System.out.println(fin);
        System.out.println(revertString);
        return fin;
    }

    //solution found online -- is better
    public static String mirrorEnds2(String string) {

        String result = "";
        int len = string.length();

        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == string.charAt(len - 1 - i))
                result += string.charAt(i);
            else
                return result;
        }
        return result;
    }
}

