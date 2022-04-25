package Array2;

/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */

public class No14 {

    public static void main(String[] args) {
        System.out.println(no14(new int[]{1, 2, 3, 4}));
    }

    public static boolean no14(int[] nums) {

        int count1s = 0;
        int count4s = 0;
        for (int num : nums) {
            if (num == 1) count1s++;
            if (num == 4) count4s++;
        }
        return count1s < 1 || count4s < 1;
    }

    //from online -- using boolean variables instead of ints
    public static boolean no14v2(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;
        for (int num : nums) {
            if (num == 1)
                has1 = true;

            if (num == 4)
                has4 = true;
        }

        return !has1 || !has4;
    }
}
