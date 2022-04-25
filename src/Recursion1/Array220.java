package Recursion1;

/*
Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10.
We'll use the convention of considering only the part of the array that begins at the given index.
In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

array220([1, 2, 20], 0) → true
array220([3, 30], 0) → true
array220([3], 0) → false
 */

public class Array220 {

    public static void main(String[] args) {
        System.out.println(array220V2(new int[]{1,2,20}, 0));
    }

    public static boolean array220(int[] nums, int index) {
        if (index >= nums.length-1) return false;
        if (nums[index] * 10 == nums[index+1]) return true;
        return array220(nums, index+1);
    }


    //de pe net
    public static boolean array220V2(int[] nums, int index) {
        if(index >= nums.length - 1) return false;
        return nums[index+1] == 10 * nums[index] || array220V2(nums, index + 1);
    }
}
