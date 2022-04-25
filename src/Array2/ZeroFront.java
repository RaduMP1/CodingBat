package Array2;

/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array.
The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
 */

import java.util.Arrays;

public class ZeroFront {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 0, 1})));
    }

    //found online
    public static int[] zeroFront(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[count]; //changing the value at i from zero to the value at 'count'
                nums[count] = 0;        // setting the value at count to zero
                count++;                //incrementing count
            }
        }
        return nums;
    }

}
