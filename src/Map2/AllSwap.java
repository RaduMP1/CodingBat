package Map2;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return
the given array of non-empty strings as follows: if a string matches an earlier string in the array,
swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything.
Using a map, this can be solved making just one pass over the array. More difficult than it looks.

allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSwap {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(allSwapV2(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
    }

    //varianta mea initiala - mai putin eficienta
    public static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        int value = 0;
        String temp;
        String[] results = new String[strings.length];

        for (String s : strings) {

            if (!map.containsKey(s.substring(0, 1))) {
                map.put(s.substring(0, 1), value);
                results[value] = s;
                value++;

            } else {
                if (map.get(s.substring(0, 1)) > strings.length) {
                    map.put(s.substring(0, 1), value);
                    results[value] = s;
                    value++;
                } else {
                    map.put(s, map.get(s.substring(0, 1)));      //la noua cheie ii da valoarea cheii initiale (swap de valoarea - partea 1)
                    temp = results[map.get(s.substring(0, 1))];  //elementul salvat in String[] results la indexul valorii initiale este salvat in temp
                    results[map.get(s.substring(0, 1))] = s;     //la elementul initial ii da noua val
                    map.put(s.substring(0, 1), value + strings.length); // la cheia initiala din map ii dam o valoare mai mare (valoare + strings.length) ca sa nu mai faca swap ulterior (swap de valoare + marirea ei pt a evita alt swap)
                    results[value] = temp;                      //la elementul actual din results ii dam valoarea celui din fatza (swap)
                    value++;
                }
            }
        }
        return results;
    }


    //varianta tot a mea -- inspirata din varianta de pe site (a mea e cu for each)
    public static String[] allSwapV2(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        int index = 0;

        for (String s: strings) {
            if (!map.containsKey(s.substring(0,1))) {
                map.put(s.substring(0,1), index);
                index++;
            } else {
                strings[index] = strings[map.get(s.substring(0,1))];    //this and next row the swap is made
                strings[map.get(s.substring(0,1))] = s;
                map.remove(s.substring(0,1));                           //delete entry from map to avoid further swap
                index++;
            }
        }
        return strings;
    }
}
