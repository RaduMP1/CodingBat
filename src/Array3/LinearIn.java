package Array3;

/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */

public class LinearIn {

    public static void main(String[] args) {
        System.out.println(linearIn2(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
    }

    //second version -- better, has only i for loop
    public static boolean linearIn2(int[] outer, int[] inner) {

        if (inner.length == 0) return true;
        int j = 0;
        for (int i = 0; i < outer.length; i++) {
            if (outer[i] == inner[j]) {
                if (j == inner.length-1) return true;
                else j++;
            }
        }
        return false;
    }


    public static boolean linearIn(int[] outer, int[] inner) {
        int tmp = 0;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if (inner[i] == outer[j]) {
                    tmp++;
                    System.out.println("inner[i] = " + inner[i] + " / outer[j] = " + outer[j] + " / tmp = " + tmp);
                    break;
                }
            }
        }
        return tmp == inner.length;
    }
}
