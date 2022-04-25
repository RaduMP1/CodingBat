package String2;

/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept
any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */

public class CountCode {

    public static void main(String[] args) {
        System.out.println(countCode("codexxcode"));
    }

    public static int countCode(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("co",i) && str.startsWith("e",i+3)) counter++;
        }
        return counter;
    }
}
