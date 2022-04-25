package Map2;

/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string,
with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {
        System.out.println(wordCountV2(new String[]{"a", "b", "a", "c", "b"}));
    }

    //de pe net -- mai buna
    public static Map<String, Integer> wordCountV2(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s: strings) {
            if (!map.containsKey(s)) map.put(s, 1); //daca nu il contine, sa il adauge cu valoarea 1
            else map.put(s, map.get(s) + 1);    //daca il contine, atunci sa il adauge cu valorea cea veche + 1
        }
        return map;
    }

    //solutia mea
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) continue;
            for (int j = i; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) counter++;
            }
            map.put(strings[i], counter);
            counter = 0;
        }
        return map;
    }
}
