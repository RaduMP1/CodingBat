package Array3;

/*
Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping).
Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
 */

import java.util.Arrays;

public class SeriesUp {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(4)));
    }

    public static int[] seriesUp(int n) {
        int[] arr = new int[n * (n + 1) / 2];
        int iterator = 0;
        int counter = 0;

        for (int i = 0; i < arr.length; i += iterator) {
            iterator++;
            for (int j = 1; j <= iterator; j++) {
                arr[counter] = j;
                counter++;
            }
        }
        return arr;
    }


    //solution found online -- better than mine
    public int[] seriesUp2(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int i = 0;

        for (int j = 1; j <= n; ++j) //identical as j++
            for (int k = 1; k <= j; ++k) //identical as k++
                result[i++] = k;
        return result;
    }

    /* analysis of found solution for example n = 4
    j = 1 >>> k = 1
    j = 2 >>> k = 1, k = 2
    j = 3 >>> k = 1, k = 2, k = 3
    j = 4 >>> k = 1, k = 2, k = 3, k= 4
     */
}
