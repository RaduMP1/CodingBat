package String1;

/*
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
The string length will be at least 2.

right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
 */

public class Right2 {

    public static void main(String[] args) {
        System.out.println(right2("Hi"));
    }

    public static String right2(String str) {
        System.out.println("1: " + str.substring(0,str.length()-2));
        System.out.println("2: " + str.substring(str.length()-2));
        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
    }
}
