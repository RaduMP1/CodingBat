package AP1;

/*
Given an array of strings, return a new array without the strings that are equal to the target string.
One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.

wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
 */

import java.util.Arrays;

public class WordsWithout {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a", "b", "c", "a"}, "a")));
    }

    public static String[] wordsWithout(String[] words, String target) {

        int counter = 0;

        for (int i = 0; i < words.length; i++) {
            if (!(words[i].equals(target))) counter++;
        }

        String[] newArray = new String[counter];
        int iterator = 0;

        for (int i = 0; iterator < counter; i++) {  //obs. folosim la conditie doar 'iterator < counter', fara 'i'
            if (!(words[i].equals(target))) {
                newArray[iterator] = words[i];
                iterator++;
            }
        }
        return newArray;
    }
}
