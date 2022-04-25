package String2;

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */

public class ZipZap {

    public static void main(String[] args) {
        System.out.println(zipZap("zopzopxxx"));
    }

    public static String zipZap(String str) {
        if (str.length()<3) return str;
        String newStr = str.substring(0,1);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) == 'z' && str.charAt(i + 1) == 'p') i++;
            newStr += str.charAt(i);
        }

        return newStr;
    }
}
