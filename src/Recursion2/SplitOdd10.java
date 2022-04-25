package Recursion2;

/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10,
and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like,
and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)

splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true
 */

public class SplitOdd10 {

    public static void main(String[] args) {
        System.out.println(splitOdd10(new int[]{5,5,5}));
    }

    public static boolean splitOdd10(int[] nums) {
        return recursive(nums, 0, 0, 0);
    }

    public static boolean recursive(int[] nums, int start, int leftSum, int rightSum) {

        if (start < nums.length) {

            return recursive(nums, start+1, leftSum + nums[start], rightSum) ||
                    recursive(nums, start+1, leftSum, rightSum + nums[start]);
        }

        return (leftSum % 10 == 0 && rightSum % 2 != 0) || (rightSum % 10 == 0 && leftSum % 2 != 0);
    }
}
