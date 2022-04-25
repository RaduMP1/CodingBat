package Recursion2;

/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with this additional constraint:
If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen. (No loops needed.)

groupNoAdj(0, [2, 5, 10, 4], 12) → true
groupNoAdj(0, [2, 5, 10, 4], 14) → false
groupNoAdj(0, [2, 5, 10, 4], 7) → false
 */

public class GroupNoAdj {

    public static void main(String[] args) {
        System.out.println(groupNoAdjV3(0, new int[]{2,5,10,4}, 12));
    }


    //de pe net -- mai buna ca a mea
    public static boolean groupNoAdjV2(int start, int[] nums, int target) {
        if(start >= nums.length)
            return target == 0;

        if(groupNoAdjV2(start+2, nums, target - nums[start]))
            return true;

        if(groupNoAdjV2(start+1, nums, target))
            return true;

        return false;
    }


    //solutia mea dupa ce am vz cea de pe net (am optimizat-o)
    public static boolean groupNoAdjV3(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        return groupNoAdjV3(start + 1, nums, target) || groupNoAdjV3(start + 2, nums, target - nums[start]);
    }

    //solutia mea initiala
    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        if (groupNoAdj(start + 1, nums, target - nums[start]))
            return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
        return groupNoAdj(start + 1, nums, target);
    }
}
