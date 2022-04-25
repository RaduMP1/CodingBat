package String2;

/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance
of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */

public class WordEnds {

    public static void main(String[] args) {
        System.out.println(wordEnds("XYabcXY123XYijkXY", "XY"));
    }

    public static String wordEnds(String str, String word) {

        int diff = str.length() - word.length();
        String fin = "";

        for (int i = 0; i <= diff; i++) {
            if (i > 0 && str.startsWith(word,i))
                fin += str.charAt(i-1);
            if (i < diff && str.startsWith(word,i))
                fin += str.charAt(i+word.length());
        }
        return fin;
    }
}
