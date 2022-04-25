package Recursion1;

/*
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
 */

public class ChangeXY {

    public static void main(String[] args) {
        System.out.println(changeXYv2("codex"));
    }

    public static String changeXY(String str) {
        if (str.length() == 0) return "";
        String newStr = "";
        if (str.charAt(0) != 'x') {
            newStr = str.substring(0,1);
        }   else newStr = "y";
        return newStr + changeXY(str.substring(1));
    }

    //de pe net >> nu are nevoie de un nou String (spre deosebire de mine) ci afiseaza caractere pur si simplu
    public static String changeXYv2(String str) {
        if(str.length() == 0) return str;

        if(str.charAt(0) == 'x') return 'y' + changeXYv2(str.substring(1));

        return str.charAt(0) + changeXYv2(str.substring(1));
    }
}
