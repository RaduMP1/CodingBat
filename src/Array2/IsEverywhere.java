package Array2;

/*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
at least one of the pair is that value. Return true if the given value is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
 */

public class IsEverywhere {

    public static void main(String[] args) {
        System.out.println(isEverywhere(new int[]{5,7,1,2,1,3}, 1));
    }

    public static boolean isEverywhere(int[] nums, int val) {

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != val && nums[i+1] != val) return false;
            System.out.println("nums[i] = " + nums[i] + "; nums[i+1] = " + nums[i+1]);
        }
        return true;
    }
}
