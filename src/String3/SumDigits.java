package String3;

/*
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the
chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0

 */

public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits2("aa1bc2d3"));
    }

    public static int sumDigits(String str) {

        String nums = "";
        int numsInt = 0;

        //create a new String 'nums' just out of the numbers of the initial string
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) nums += str.charAt(i);
        }

        //int numsInt += each element of string nums converted to an int with 'Integer.parseInt...'
        for (int i = 0; i < nums.length(); i++) {
            numsInt += Integer.parseInt(nums.substring(i, i + 1));
        }

        return numsInt;
    }


    //a simpler solution from the web
    public static int sumDigits2(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) sum = sum + str.charAt(i) - '0'; //the key is to add - '0' , then the addition will work
        }

        return sum;
    }
}
