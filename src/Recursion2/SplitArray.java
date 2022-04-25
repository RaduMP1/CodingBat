package Recursion2;

/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same.
Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like,
and make the initial call to your recursive helper from splitArray(). (No loops needed.)

splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true
 */

public class SplitArray {

    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{1, 1, 3, 3}));
    }

    public static boolean splitArray(int[] nums) {

        //return halfSum(0, nums); //call pe varianta mea
        return recursive(nums, 1,0,0);  //call pe varianta luata de pe net
    }

    //varianta mea -- nu am respectat instructiunea si am folosit un loop
    public static boolean halfSum(int start, int[] nums) {
        if (start >= nums.length) return true;

        int sum = 0;
        for (int i : nums) sum += i;    //calculez (cu loop) suma tuturor elementelor din array

        if (sum % 2 != 0) return false; //daca suma e impara, atunci sa returneze fals -- ca e clar ca nu poate fi impartita in 2 grupuri egale
        else if (nums[start] > sum / 2) return false;   //vezi explicatie 1

        return halfSum(start + 1, nums);
    }

    //de pe net, vezi explicatie 2 -- e corecta ca nu foloseste niciun loop
    public static boolean recursive(int[] nums, int start, int leftSum, int rightSum){
        if (start < nums.length) {
            return recursive(nums, start + 1, leftSum + nums[start], rightSum) ||
                   recursive(nums, start + 1, leftSum, rightSum + nums[start]);
        }
        return leftSum == rightSum;
    }
}

/*
explicatie 1
Mi-am dat seama ca daca unul (oricare) din elementele array-ului este mai mare decat jumatatea sumei, atunci
rezultatul e fals. de ex. array: 9,1,2 ==> suma e 12 (e para). Jumatatea lui 12 e 6. Dar 9 > 6 deci nu se va putea imparti
in 2 grupuri egale.


explicatie 2 - metoda luata de pe net
adunca la leftsum respectiv la rightsum valoarea lui nums[start] in vreme ce incrementeaza start
pe desen se poate observa cum la variantele true, leftSum ajunge sa fie egal cu rightSum

 */
