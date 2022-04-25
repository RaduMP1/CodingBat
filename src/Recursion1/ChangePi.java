package Recursion1;

/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
 */

public class ChangePi {

    public static void main(String[] args) {
        System.out.println(changePi("xpix"));
    }

    public static String changePi(String str) {
        if (str.length() < 2) return str;
        if (str.substring(0,2).equals("pi")) return "3.14" + changePi(str.substring(2));
        return str.charAt(0) + changePi(str.substring(1));          //daca nu pun "str.charAt(0) +..." atunci imi tot sare prima litera, chiar daca ea nu e cu pi, si ar trebui sa fie
    }
}
