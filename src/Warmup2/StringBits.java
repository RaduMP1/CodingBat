package Warmup2;

/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */

public class StringBits {

    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
    }

    public static String stringBits(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i=i+2) {
            newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }
}
