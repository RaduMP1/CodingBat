package Recursion2;

/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target
with these additional constraints: all multiples of 5 in the array must be included in the group.
If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)

groupSum5(0, [2, 5, 10, 4], 19) → true
groupSum5(0, [2, 5, 10, 4], 17) → true
groupSum5(0, [2, 5, 10, 4], 12) → false
 */

public class GroupSum5 {

    public static void main(String[] args) {
        System.out.println(groupSum5(0, new int[]{3, 5, 1}, 9));
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0); //baza spre care facem recursia

        if (nums[start] % 5 == 0) {
            if (start < nums.length-1 && nums[start+1] == 1) return groupSum5(start+2, nums, target - nums[start]); //daca conditiile se aplica atunci "start+2" adica sare peste '1' dar totodata target-nums[start] ca sa ia 5-ul
            return groupSum5(start+1, nums, target - nums[start]);  //in rest sa ia 5-ul
        }
        return groupSum5(start+1, nums, target) || groupSum5(start+1, nums, target - nums[start]);
    }
}
