package String2;

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */

public class CatDog {

    public static void main(String[] args) {
        System.out.println(catDog("1cat1cadodog"));
    }

    public static boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("cat", i)) countCat++;
            if (str.startsWith("dog", i)) countDog++;
        }
        return countCat == countDog;
    }
}
