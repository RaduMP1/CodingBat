package Array2;

/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come after the
last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */

import java.util.Arrays;

public class Post4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(post4(new int[]{4, 1, 4, 2})));
    }

    public static int[] post4(int[] nums) {

        int indexAfterFour = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                indexAfterFour = i + 1;
                break;
            }
        }
        int fourToEnd = nums.length - indexAfterFour;
        int[] afterFour = new int[fourToEnd];
        for (int i = 0; i < afterFour.length; i++) {
            afterFour[i] = nums[i + indexAfterFour];
        }
        return afterFour;
    }

    public int[] post4V2(int[] nums) {
        int i = nums.length - 1;

        while (nums[i] != 4) i--;

        int[] arr = new int[nums.length - i - 1];

        for (int j = 0; j < arr.length; j++)
            arr[j] = nums[i + j + 1];

        return arr;
    }
}
