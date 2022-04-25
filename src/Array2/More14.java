package Array2;

/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */

public class More14 {

    public static void main(String[] args) {
        System.out.println(more14(new int[]{1,4,1,4}));
    }

    public static boolean more14(int[] nums) {
        int count1s = 0;
        int count4s = 0;
        for (int num : nums) {
            if (num == 1) count1s++;
            if (num == 4) count4s++;
        }
        return count1s > count4s;
    }
}
