package AP1;

/*
Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
 */

import java.util.Arrays;

public class WordsFront {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wordsFront(new String[]{"a", "b", "c", "d"}, 0)));
    }

    public static String[] wordsFront(String[] words, int n) {
        String[] newArray = new String[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = words[i];
        }
        return newArray;
    }
}
