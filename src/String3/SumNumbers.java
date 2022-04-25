package String3;

/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is
one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
 */

public class SumNumbers {

    public static void main(String[] args) {
        System.out.println(sumNumbers2("abc123xy10"));
    }


    public static int sumNumbers2(String str) {
        int sum = 0;
        String tmp = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                // if i smaller than len-1 (iteration avoids indexoutofbounds) and i+1 is digit
                if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                    tmp += str.charAt(i);
                    System.out.println("char at i este: " + str.charAt(i) + " / A: tmp: " + tmp);
                } else { //if i NOT smaller than len-1 AND i+1 NOT a digit
                    tmp += str.charAt(i); //still add the digit of i
                    System.out.println("char at i este: " + str.charAt(i) + " / B: tmp: " + tmp);
                    sum += Integer.parseInt(tmp); //then parse to int and add to sum
                    tmp = ""; //then reset tmp to null
                }
            }
        }
        return sum;
    }
}
