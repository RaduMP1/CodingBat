package Array2;

/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
 */

public class BigDiff {

    public static void main(String[] args) {
        System.out.println(bigDiff(new int[]{10, 3, 5, 6}));
    }


    public static int bigDiff(int[] nums) {
        int minimal = nums[0];
        int maximal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            //minimal takes the value of the minimal of the first 2 and then it loops comparing ITSELF with the value of nums[i]
            minimal = Math.min(minimal, nums[i]);
            //similar for maximal
            maximal = Math.max(maximal, nums[i]);
        }

        return maximal - minimal;
    }
}

