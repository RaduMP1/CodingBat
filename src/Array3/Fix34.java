package Array3;

/*
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately
followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's,
every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
 */

import java.util.Arrays;

public class Fix34 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix34V2(new int[]{3, 1, 1, 3, 4, 4})));
    }

    //third version
    public static int[] fix34V3(int[] nums) {
        int tmp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                tmp = nums[i + 1];
                for (int j = i + 1; j < nums.length; j++) {
                    System.out.println("tmp = " + tmp);
                    if (nums[j] == 4 && nums[j - 1] != 3) nums[j] = tmp;
                }
                nums[i + 1] = 4;
            }
        }
        return nums;
    }


    //second version
    public static int[] fix34V2(int[] nums) {
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i+1] != 4) {
                tmp = nums[i + 1];
                nums[i + 1] = 4;
            }
            if (i > 0 && nums[i] == 4 && nums[i-1] != 3) nums[i] = tmp;
        }
        for (int i = nums.length-1; i >= 0 ; i--) {
            if (nums[i] == 3) {
                tmp = nums[i+1];
                nums[i+1] = 4;
            }
            if (nums[i] == 4) nums[i] = tmp;
        }

        return nums;
    }


    public static int[] fix34(int[] nums) {

        int threeCounter = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) threeCounter++;
        }

        int[] tempArray = new int[threeCounter];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                tempArray[counter] = nums[i + 1];
                counter++;
                nums[i + 1] = 4;
            }
        }

        counter = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i - 1] != 3) {
                nums[i] = tempArray[counter];
                counter++;
            }
        }

        return nums;
    }
}
