package Recursion1;

/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).


factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
 */

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


    public static int factorial(int n) {
        if (n == 1) return 1;
        System.out.println(n);
        return n * factorial(n-1);  // de ex. daca n = 4: rezultatul e: 4*3*2*1 = 24
    }



    //solutia mea -- cu loop
    public static int factorialV2(int n) {
        int other = 0;
        int factorial = 1;

        while (other < n) {
            factorial *= n-other;
            other++;
        }
        return factorial;
    }
}
