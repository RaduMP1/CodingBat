package Map2;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return
the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array.
A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled.
Using a map, this can be solved making just one pass over the array. More difficult than it looks.

firstSwap(["ab", "ac"]) → ["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstSwap {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
    }

    public static String[] firstSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        int index = 0;

        for (String key: strings) {

            if (!map.containsKey(key.substring(0,1))) {
                map.put(key.substring(0,1), index);
                index++;
            } else if (map.get(key.substring(0,1)) < strings.length){       //*
                strings[index] = strings[map.get(key.substring(0,1))];
                strings[map.get(key.substring(0,1))] = key;
                map.put(key.substring(0,1), strings.length);    //*
                index++;
            }
        }
        return strings;
    }
}

/*
spre deosebire de aplicatia precedenta AllSwap, aici la randul 37, in loc sa dau remove, sa sterg elementul din map,
ii dau o valoarea mai mare, gen valoarea strings.length.
Apoi conditionez la randul 34, dupa else, ca sa se efectueze swap doar daca elementele au valoarea mai mica decat
string.length >>> adica daca deja a fost parte dintr-un swap si a primit valoarea mai mare a lui string.length, nu va
mai fi parte din alt swap.
 */