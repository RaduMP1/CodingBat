package String2;

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */

public class RepeatSeparator {

    public static void main(String[] args) {
        System.out.println(repeatSeparator("aaa", "", 0));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String newWord = "";
        for (int i = 0; i < count; i++) {
            newWord += word + sep;
        }
        return newWord.substring(0, newWord.length() - sep.length());
    }
}