package Recursion1;

/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
 */

public class CountX {

    public static void main(String[] args) {
        System.out.println(countXV2("xxhixx"));
    }

    public static int countX(String str) {
        if (str.length() == 0) return 0;
        if (str.charAt(str.length() - 1) == 'x') return 1 + countX(str.substring(0, str.length() - 1));
        return countX(str.substring(0, str.length() - 1));
    }

    //de pe net >> aceeasi idee ca la mine, doar ca verifica caracterele de la inceputul stringului (de la stanga la dreapta), iar eu am facut de la dreapta la stanga
    public static int countXV2(String str) {
        if (str.length() == 0) return 0;

        if (str.charAt(0) == 'x') return 1 + countXV2(str.substring(1));

        return countXV2(str.substring(1));
    }
}
