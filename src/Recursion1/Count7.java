package Recursion1;

/*
Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count7(717) → 2
count7(7) → 1
count7(123) → 0
 */

public class Count7 {

    public static void main(String[] args) {
        System.out.println(count7(717));
    }

    public static int count7(int n) {
        System.out.println("n = " + n);
        if (n == 0) {
            System.out.println("***********");
            return 0;
        }
        if (n % 10 == 7) {
            System.out.println("n % 10 is 7");
            System.out.println("***********");
            return 1 + count7(n / 10);  // partea cu "1+" face sa se poata numara de cate ori avem cifra 7 in valoarea initiala a lui n. De aia o avem aici la if n % 10 == 7 si la ultimul return nu mai e cu "1+"
        }
        System.out.println("***********");
        return count7(n / 10);
    }
}
