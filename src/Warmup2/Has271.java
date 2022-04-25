package Warmup2;

/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
 */

public class Has271 {

    public static void main(String[] args) {
        System.out.println(has271(new int[]{2,7,-1}));
    }

    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            int x = nums[i];
            int y = nums[i+1];
            int z = nums[i+2];

            if ((y == x+5) && (z == x-1 || Math.abs((x-1)-z) <= 2)) return true;
        }
        return false;
    }
}
