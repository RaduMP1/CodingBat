package Recursion2;

/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same,
with these constraints: all the values that are multiple of 5 must be in one group,
and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)

split53([1, 1]) → true
split53([1, 1, 1]) → false
split53([2, 4, 2]) → true
 */

public class Split53 {

    public static void main(String[] args) {
        System.out.println(split53(new int[]{1,1,1}));
    }

    public static boolean split53(int[] nums) {
        return recursive(nums, 0, 0, 0);
    }

    public static boolean recursive(int[] nums, int start, int leftSum, int rightSum) {

        if (start < nums.length) {

            if (nums[start] % 5 == 0) {
                return recursive(nums, start + 1, leftSum + nums[start], rightSum);
            }
            if (nums[start] % 3 == 0) {
                return recursive(nums, start+1, leftSum, rightSum + nums[start]);
            }

            return recursive(nums, start+1, leftSum + nums[start], rightSum) ||
                    recursive(nums, start+1, leftSum, rightSum + nums[start]);

        }

        return leftSum == rightSum;
    }
}
