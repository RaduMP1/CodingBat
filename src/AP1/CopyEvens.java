package AP1;

/*
Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array.
The original array will contain at least "count" even numbers.

copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
 */

import java.util.Arrays;

public class CopyEvens {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(copyEvens(new int[]{3, 2, 4, 5, 8,}, 2)));
    }

    public static int[] copyEvens(int[] nums, int count) {

        int[] newArray = new int[count];
        int iterator = 0;

        for (int i = 0; iterator < count; i++) {    //obs. la conditie avem doar 'iterator < count' nimic cu 'i' pt ca nu e necesar
            if (nums[i] % 2 == 0) {
                newArray[iterator] = nums[i];
                iterator++;
            }
        }
        return newArray;
    }
}
