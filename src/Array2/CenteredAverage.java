package Array2;

/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
You may assume that the array is length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */

import java.util.Arrays;

public class CenteredAverage {

    public static void main(String[] args) {
        System.out.println(centeredAverage2(new int[]{5, 3, 2, 7, 4, 19}));
    }

    public static int centeredAverage(int[] nums) {

        Arrays.sort(nums);

        int sum = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            sum += nums[i];
        }

        return sum / (nums.length-2);
    }

    //from online -- w/o Array.sort
    public static int centeredAverage2(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            //i = 0; min = nums[0] = 5; >>> min = Math.min(5, nums[i] = 5) >>> i = 1; min = 5; min = Math.min(5, nums[1] = 3.......
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return (sum - min - max) / (nums.length - 2);
    }

}
