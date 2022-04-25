package Array2;

/*
This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews.
(See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not including end,
so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers,
except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual
version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.

fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
 */

import java.util.Arrays;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(1, 6)));
    }

    public static String[] fizzBuzz(int start, int end) {

        int[] nums = new int[end - start];
        String[] stringNums = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = start;
            start++;
            if (nums[i] % 3 == 0 && nums[i] % 5 == 0) stringNums[i] = "FizzBuzz";
            else if (nums[i] % 3 == 0) stringNums[i] = "Fizz";
            else if (nums[i] % 5 == 0) stringNums[i] = "Buzz";
            else stringNums[i] = String.valueOf(nums[i]);

        }
        return stringNums;
    }
}
