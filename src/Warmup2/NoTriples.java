package Warmup2;

/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */

public class NoTriples {

    public static void main(String[] args) {
        System.out.println(noTriples(new int[]{1,1,2,2,2}));
    }

    public static boolean noTriples(int[] nums) {
        // Iterate < length-2, so can use i+1 and i+2 in the loop
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) return false;
        }
        return true;
    }
}
