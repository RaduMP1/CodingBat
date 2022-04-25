package Warmup2;

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

solutie: cea mai buna e varianta a 3a / de retinut str.indexOf(..)
 */

public class DoubleX {

    public static void main(String[] args) {
        //System.out.println(doubleX("xx"));
        //System.out.println(theirVersionDoubleX("xxabc"));
        System.out.println(theirSecondVersionDoubleX("xabx"));
    }

    static boolean doubleX(String str) {
        int xCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') xCounter++;
            if (str.startsWith("xx", i) && xCounter < 2) return true;
        }
        return false;

    }

    static boolean theirVersionDoubleX(String str) {
        int i = str.indexOf("x");   //i va primi valoarea indexului unde se afla primul 'x'
        System.out.println("i este: " + i);
        if (i == -1) return false; // no "x" at all >> daca primul 'x' este la prima litera, atunci i = 0 (ca indexarea incepe de la 0). Daca nu e niciun x, atunci i = -1

        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");

    }

    static boolean theirSecondVersionDoubleX(String str) {
        int i = str.indexOf("x");
        String x = str.substring(i);
        return x.startsWith("xx");
    }
}
