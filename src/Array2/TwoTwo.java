package Array2;

/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
 */

public class TwoTwo {

    public static void main(String[] args) {
        System.out.println(twoTwo(new int[]{1, 3, 4}));
    }

    public static boolean twoTwo(int[] nums) {

        boolean conditionMet = false;
        int count2s = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                count2s++;
                conditionMet = i > 0 && nums[i - 1] == 2; //read: conditionMet is true IF i>0 and nums[i-1] == 2
            }
        }
        return conditionMet || count2s == 0;
    }
}
