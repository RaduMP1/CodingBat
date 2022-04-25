package Array2;

/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */

public class Has12 {

    public static void main(String[] args) {
        System.out.println(has12(new int[]{1,3,7}));
    }

    public static boolean has12(int[] nums) {
        boolean is1 = false;
        for (int num : nums) {
            if (num == 1) is1 = true;
            if (is1 && num == 2) return true;
        }
        return false;
    }
}
