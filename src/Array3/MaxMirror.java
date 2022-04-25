package Array3;

/*
We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order.
For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2          //  5, 9, 9, 4, 5, 4, 9, 9, 2
 */

import java.util.Arrays;

public class MaxMirror {

    public static void main(String[] args) {
                                            //   0  1  2  3  4  5  6
        System.out.println(maxMirrorV2(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }

    //online version -- better than mine
    public static int maxMirrorV2(int[] nums) {
        int len = nums.length;
        int size = 0;

        for(int i = 0; i < len; i++) {
            int iterator = 0;  //determines the length of the mirror; whenever i iterates, iterator will be zero again
            //Note. can have in for loop condition like:   j >= 0 && i + iterator < len
            for(int j = len - 1; j >= 0 && i + iterator < len; j--) {      // i + iterator < len in order to avoid ArrayIndexOutOfBounds exception
                if(nums[i + iterator] == nums[j]) {     //kind of using 'iterator' to iterate on the same loop (level) with j
                    System.out.println("A. i = " + i + " & iterator = " + iterator + " // i + iterator = " + (i + iterator) + " & nums[i + iterator] = " + nums[i + iterator] +
                            " // j = " + j + " & nums[j] = " + nums[j]);
                    iterator++;
                } else {    //if not equal, then take the value of iterator, and reset it to zero
                    System.out.println("B. i = " + i + " & iterator = " + iterator + " // i + iterator = " + (i + iterator) + " & nums[i + iterator] = " + nums[i + iterator] +
                            " // j = " + j + " & nums[j] = " + nums[j]);
                    size = Math.max(size, iterator);  //catching the value of 'size' when there is no equality, before resetting 'iterator'
                    System.out.println("inside j loop, size = " + size);
                    iterator = 0;
                }
            }
            size = Math.max(size, iterator);    //must 'catch' the value of 'size' also outside the j loop: when i iterates
            System.out.println("outside j loop, size = " + size);
        }
        return size;
    }



    //my version
    public static int maxMirror(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int counter = 0;
        int superCounter = 0;
        int previousIndexOfIWhenEqualToJ = 0;
        int previousValueOfJ = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] == nums[j]) {
                    counter++;

                    if (i != previousIndexOfIWhenEqualToJ + 1) counter = 1;
                    if (counter > superCounter) superCounter = counter;
                    if (j > previousValueOfJ + 1) counter = 1;

                    if (i + 1 == j) return counter * 2;
                    if (i + 1 == j - 1) return Math.max(superCounter, counter * 2 + 1);

                    previousIndexOfIWhenEqualToJ = i;
                    previousValueOfJ = j;
                    break;
                }
            }
        }
        return superCounter;
    }
}
