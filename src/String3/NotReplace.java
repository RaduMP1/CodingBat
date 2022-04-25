package String3;

/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
(Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 */

public class NotReplace {

    public static void main(String[] args) {
        System.out.println(notReplace("this is a test"));
    }

    public static String notReplace(String str) {

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            // if str does NOT start with "is" at index i
            if (!(str.startsWith("is", i))) str2 += str.charAt(i);
            else { // if str DOES start with "is" at index i
                // if i smaller than length-2 (to avoid indexoutofbounds) and character after 'is' is NOT a letter OR i bigger than 0 (to avoid indexoutofbounds) and i-1 is a letter
                if (i < str.length() - 2 && (Character.isLetter(str.charAt(i + 2))) || i > 0 && Character.isLetter(str.charAt(i - 1))) {
                    str2 += str.charAt(i);
                } else {
                    str2 += "is not";
                    i++;
                }
            }
            //System.out.println(str2);
        }
        return str2;
    }
}
