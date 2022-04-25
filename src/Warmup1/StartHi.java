package Warmup1;

/*
Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */

public class StartHi {

    public static void main(String[] args) {
        System.out.println(startHi("highland"));
    }

    public static boolean startHi(String str) {
        if (str.length() >= 2) return str.substring(0,2).equals("hi");
        return false;
    }
}
