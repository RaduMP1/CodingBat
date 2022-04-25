package AP1;

/*
We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly,
so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

dividesSelf(128) → true
dividesSelf(12) → true
dividesSelf(120) → false
 */

public class DividesSelf {

    public static void main(String[] args) {
        System.out.println(dividesSelf(13));
    }

    public static boolean dividesSelf(int n) {
        int lastDigit = 0;
        int x = n;

        while (x != 0) {
            lastDigit = x % 10;
            if (lastDigit == 0 || n % lastDigit != 0) return false;
            x = x / 10;
        }
        return true;
    }

    // de pe net
    public static boolean dividesSelfV2(int n) {

        for(int val = n; val != 0; val /= 10) {
            int digit = val % 10;
            if(digit == 0 || n % digit != 0)
                return false;
        }

        return true;
    }
}
