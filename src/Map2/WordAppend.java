package Map2;

/*
Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc.
time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
 */

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a", "b"}));
    }

    //solutia mea -- mai buna decat ce am gasit online :)
    public static String wordAppend(String[] strings) {

        Map<String, String> map = new HashMap<>();
        String result = "";

        for (String s: strings) {
            if (!map.containsKey(s)) {
                map.put(s, s);
            } else {
                result += map.get(s);
                map.remove(s);
            }
        }
        return result;
    }
}
