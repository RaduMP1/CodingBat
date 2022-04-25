package Logic2;

/*
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced,
so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */

public class EvenlySpaced {

    public static void main(String[] args) {
        System.out.println(evenlySpaced(4,6,2));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        if ((a == b && a != c) || (a == c && b != c) || (b == c && a != b)) return false;
        return Math.abs(a-b) == Math.abs(b-c) || Math.abs(a-c) == Math.abs(b-c) || Math.abs(a-b) == Math.abs(a-c);
    }
}
