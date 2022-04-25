package Array3;

/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 */

public class CanBalance {

    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
    }

    public static boolean canBalance(int[] nums) {
        int tmp = 0;
        int tmp2 = 0;
        for (int num : nums) {
            tmp += num;
        }
        System.out.println(tmp);
        for (int num : nums) {
            tmp2 += num;
            System.out.println("tmp2 = " + tmp2 + " / tmp - tmp2 = " + (tmp - tmp2));
            if (tmp2 == tmp - tmp2) return true;
        }
        return false;
    }
}
