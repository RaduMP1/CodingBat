package Array3;

/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 */


public class CountClumps {

    public static void main(String[] args) {
        System.out.println(countClumpsV2(new int[]{1,1,1,1,1}));
    }

    public static int countClumps(int[] nums) {

        int clumps = 0;
        int value = -1;

        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] == nums[i+1]) {
                clumps++;
                if (nums[i] == value) clumps--;
                value = nums[i];
            } else value = -1;
        }
        return clumps;
    }

    //de pe net
    public static int countClumpsV2(int[] nums) {
        boolean match = false;
        int count = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1] && !match) {   //desi match e initial false, negarea lui se considera tot false
                match = true;
                count++;
            }
            else if (nums[i] != nums[i+1]) {
                match = false;
            }
        }
        return count;
    }
}
