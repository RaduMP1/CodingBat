package Array3;

/*
(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array,
but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move.
The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
 */

import java.util.Arrays;

public class Fix45 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix45V3(new int[]{5, 4, 5, 4, 1})));
    }


    //third version -- best. only 2 'for' loops
    public static int[] fix45V3(int[] nums) {

        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                for (int j = 0; j < nums.length; j++) {
                    if ((j == 0 && nums[j] == 5) || (j > 0 && nums[j] == 5 && nums[j - 1] != 4)) tmp = j;
                    System.out.println("tmp = " + tmp);
                }
                nums[tmp] = nums[i + 1];
                nums[i + 1] = 5;
            }
        }
        return nums;
    }


    //second version
    public static int[] fix45V2(int[] nums) {

        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) counter++;
        }
        int[] after4s = new int[counter];
        counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                after4s[counter] = nums[i + 1];
                counter++;
                nums[i + 1] = 5;
            }
        }
        counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == 5 || i > 0 && nums[i] == 5 && nums[i - 1] != 4) {
                nums[i] = after4s[counter];
                counter++;
            }
        }
        return nums;
    }


    //first version
    public static int[] fix45(int[] nums) {

        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == 5 || i > 0 && nums[i] == 5 && nums[i - 1] != 4) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j + 1] != 5) {
                        tmp = nums[j + 1];
                        nums[j + 1] = 5;
                    }
                }
                nums[i] = tmp;
            }
            if (nums[i] == 4 && nums[i + 1] != 5) {
                tmp = nums[i + 1];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 5 && nums[j - 1] != 4) nums[j] = tmp;
                }
                nums[i + 1] = 5;
            }
        }
        return nums;
    }
}
