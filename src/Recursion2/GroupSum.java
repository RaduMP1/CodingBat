package Recursion2;

/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target?
This is a classic backtracking recursion problem. Once you understand the recursive backtracking strategy in this problem,
you can use the same pattern for many problems to search a space of choices. Rather than looking at the whole array,
our convention is to consider the part of the array starting at index start and continuing to the end of the array.
The caller can specify the whole array simply by passing start as 0. No loops are needed -- the recursive calls progress down the array.

groupSum(0, [2, 4, 8], 10) → true
groupSum(0, [2, 4, 8], 14) → true
groupSum(0, [2, 4, 8], 9) → false
 */

public class GroupSum {

    public static void main(String[] args) {
        System.out.println(groupSumV2(0, new int[]{2,4,9}, 10));
    }


    //solutia de pe codingbat -- optimizata de mine
    public static boolean groupSumV2(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);     //daca start e mai mare sau egal cu nums length returneaza true DOAR daca target == 0
        // prima varianta in care este luat in calcul nums[start] si de aia e scazut din target SI a 2a varianta in care nu e luat in calcul si doar se trece mai departe -- trebuie sa dea true doar una din ele
        return groupSumV2(start+1, nums, target - nums[start]) || groupSumV2(start+1, nums, target);
    }


    //solutia mea initiala -- mai ineficienta
    public static boolean groupSum(int start, int[] nums, int target) {
        if (nums.length == 0) return true;
        if (nums.length == 1) {
            return nums[0] == target || (start == nums.length && target == 0);
        }

        if (start+1 == nums.length) return false;
        if (nums[start] == target) return true;
        if (nums[nums.length-1] == target) return true;
        if (nums[start] + nums[nums.length-1] == target) return true;

        if (nums[start] < target) nums[start+1] += nums[start];
        return groupSum(start + 1, nums, target);
    }


}
