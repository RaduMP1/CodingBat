package Array3;

/*
Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements
between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */

public class MaxSpan {

    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3}));
    }

    public static int maxSpan(int[] nums) {

        int leftSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[0]) leftSpan = i+1;
        }
        int rightSpan = 0;
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i] == nums[nums.length-1]) rightSpan = nums.length-i;
        }

        return Math.max(leftSpan,rightSpan);
    }
}
