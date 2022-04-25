package String3;

/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of
appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 */

public class EqualIsNot {

    public static void main(String[] args) {
        System.out.println(equalIsNot("This is notNot"));
    }

    public static boolean equalIsNot(String str) {
        int isCounter = 0;
        int notCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("is",i)) isCounter++;
            if (str.startsWith("not",i)) notCounter++;
        }
        System.out.println(isCounter + "-" + notCounter);
        return isCounter == notCounter;
    }
}
