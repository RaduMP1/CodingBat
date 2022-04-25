package String2;

/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced
by pluses ("+"), except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */

public class PlusOut {

    public static void main(String[] args) {
        System.out.println(plusOut("1xy3xy22", "xy"));
    }

    public static String plusOut(String str, String word) {

        String finalStr = "";

        for (int i = 0; i < str.length(); i++) {
            System.out.println("i este: " + str.charAt(i));
            if (str.startsWith(word,i)) {
                finalStr += word;
                i = i + word.length()-1;
            }
            else finalStr += "+";
            System.out.println(finalStr + "\n");
        }
        return finalStr;
    }
}
