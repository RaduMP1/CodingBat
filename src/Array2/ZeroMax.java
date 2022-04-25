package Array2;

/*
Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array.
If there is no odd value to the right of the zero, leave the zero as a zero.

zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
 */

import java.util.Arrays;

public class ZeroMax {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 4, 0, 3})));
    }

    //found online -- better than mine
    public static int[] zeroMax(int[] nums) {
        int max = 0;
        for (int i = nums.length-1; i >= 0 ; i--) {
            if (nums[i] % 2 != 0) max = Math.max(max, nums[i]);
            if (nums[i] == 0) nums[i] = max;
            System.out.println("nums[i] = " + nums[i] + " / max = " + max);
        }
        return nums;
    }


    //my solution
    public static int[] zeroMax2(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int oddCounter = 0;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 != 0) oddCounter++;
                }
                int[] oddsArray = new int[oddCounter];
                int iterator = 0;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 != 0) {
                        oddsArray[iterator] = nums[j];
                        iterator++;
                    }
                }
                if (oddsArray.length == 1) nums[i] = oddsArray[0];
                if (oddsArray.length > 1) {
                    int maxValue = 0;
                    for (int j = 0; j < oddsArray.length - 1; j++) {
                        maxValue = Math.max(oddsArray[j], oddsArray[j + 1]);
                    }
                    nums[i] = maxValue;
                }
            }
        }
        return nums;
    }
}
