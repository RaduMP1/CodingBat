package Array2;

/*
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the
next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
 */

import java.util.Arrays;

public class Sum67 {

    public static void main(String[] args) {
        System.out.println(sum67(new int[]{1, 1, 6, 5, 8, 7}));
    }

    public static int sum67(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                while (nums[i] != 7) {
                    nums[i] = 0;
                    i++;
                }
                if (nums[i] == 7) nums[i] = 0;
            }
            sum += nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return sum;
    }

    public static int sum67b(int[] nums) {
        int sum = 0;
        boolean inRange = false;    //is initialized with false

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 6)
                inRange = true;     //is being set to true if 6

            if(!inRange)    //if inRange is false
                sum += nums[i]; //start adding

            if(inRange && nums[i] == 7)     //if inRange is true (so it passed a 6) and nums[i] is 7
                inRange = false;            // then inRange is false (so can start adding again)

        }

        return sum;
    }
}
