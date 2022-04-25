package Recursion1;

/*
Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
We'll use the convention of considering only the part of the array that begins at the given index.
In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

array11([1, 2, 11], 0) → 1
array11([11, 11], 0) → 2
array11([1, 2, 3, 4], 0) → 0
 */

public class Array11 {

    public static void main(String[] args) {
        System.out.println(array11(new int[]{1,2,11},0));
    }

    public static int array11(int[] nums, int index) {
        if (index == nums.length) return 0;
        int count = 0;
        if (nums[index] == 11) count = 1;
        return count + array11(nums, index+1);
    }


    // varianta fara un counter, in care folsim return 1 + ...
    public int array11V2(int[] nums, int index) {
        if (index >= nums.length) return 0;
        if (nums[index] == 11) return 1 + array11V2(nums,index+1);
        else return array11V2(nums,index+1);
    }
}
