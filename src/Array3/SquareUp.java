package Array3;

/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */

import java.util.Arrays;

public class SquareUp {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp2(4)));
    }


    //found online -- better than mine
    public static int[] squareUp2(int n) {
        int[] arr = new int[n * n];

        if (n == 0) return arr;

        //below comments valid just for n = 4 (as example)
        for (int i = n - 1; i < arr.length; i += n) { //starts at value 3, increases by 4: i = 3, i = 7, i = 11, i = 15 (arr.length = 16)
            for (int j = i; j >= i - i / n; j--) arr[j] = i - j + 1;
            /*
            for i = 3 >>>> j = 3; j >= 3 - 0 ; j-- >>>>> arr[3] = 3 - 3 + 1;
            for i = 7 >>>> j = 7; j >= 7 - 1 ; j-- >>>>> arr[7] = 7 - 7 + 1;   //// j = 6; j >= 7-1 >>>>>>> arr[6] = 7 - 6 + 1
            for i = 11 >>>> j = 11; j >= 11 - 2 ; j-- >>>>> arr[11] = 11 - 11 + 1;  //// j = 10....j = 9....;
            ......
             */
        }

        return arr;
    }


    //my version
    public static int[] squareUp(int n) {

        int[] squareNums = new int[n * n];
        int[] temp = new int[n];

        int iterator = 1;
        for (int i = 0; i < n; i++) {
            temp[i] = iterator;
            iterator++;
        }

        iterator = 0;
        int capac = n - 1;
        for (int i = squareNums.length - 1; i >= 0; i--) {
            if (iterator < n) {
                squareNums[i] = temp[iterator];
                iterator++;
            } else {
                iterator = 0;
                squareNums[i] = temp[iterator];
                iterator++;
                temp[capac] = 0;
                capac--;
            }

        }
        return squareNums;
    }
}
