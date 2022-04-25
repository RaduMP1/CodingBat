package Warmup2;

/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */

public class CountXX {

    public static void main(String[] args) {
        System.out.println(countXX("abcxxx"));
    }

    static int countXX(String str) {
        int counter = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals("xx")) counter++;
        }
        return counter;
    }
}
