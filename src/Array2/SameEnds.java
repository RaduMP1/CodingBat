package Array2;

/*
Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6},
the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.

sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
 */

import java.util.Arrays;

public class SameEnds {

    public static void main(String[] args) {
        System.out.println(sameEnds2(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
    }

    public static boolean sameEnds(int[] nums, int len) {

        int[] front = new int[len];
        int[] back = new int[len];

        System.arraycopy(nums, 0, front, 0, len); //srcPos = sourcePostion ; destPos = destinationPosition
        System.arraycopy(nums, nums.length-len, back, 0, len);

        System.out.println(Arrays.toString(front));
        System.out.println(Arrays.toString(back));

        return Arrays.equals(front, back);
    }



    //version NOT using System.arraycopy
    public static boolean sameEnds2(int[] nums, int len) {

        int[] front = new int[len];
        int[] back = new int[len];

        for (int i = 0; i < len; i++) {
            front[i] = nums[i];
            back[i] = nums[(nums.length-len)+i];
        }

        System.out.println(Arrays.toString(front));
        System.out.println(Arrays.toString(back));

        return Arrays.equals(front, back);
    }
}
