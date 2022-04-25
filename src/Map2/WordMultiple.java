package Map2;

/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if
that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<>();

        for (String s: strings) {
            if (!map.containsKey(s)) map.put(s, false);
            else map.put(s, true);
        }
        return map;
    }
}
