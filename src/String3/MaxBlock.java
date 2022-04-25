package String3;

/*
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 */

import java.util.ArrayList;

public class MaxBlock {

    public static void main(String[] args) {
        System.out.println(maxBlock2("a"));
    }

    public static int maxBlock(String str) {

        if (str.length() == 0) return 0;
        int counter = 0;
        int superCounter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                counter++;
            } else counter = 0;
            if (superCounter < counter) superCounter = counter;
        }
        return superCounter + 1;
    }


    // a less efficient variant
    public static int maxBlock2(String str) {
        if (str.length() < 2) return 0;
        int counter = 0;
        ArrayList<Integer> countArray = new ArrayList<>();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                counter++;
                countArray.add(counter);
            } else counter = 0;
        }
        if (countArray.size() == 1) return countArray.get(0) + 1;
        for (int i = 0; i < countArray.size() - 1; i++) {
            if (countArray.get(i) < countArray.get(i + 1)) counter = countArray.get(i + 1);
        }
        return counter + 1;
    }
}
