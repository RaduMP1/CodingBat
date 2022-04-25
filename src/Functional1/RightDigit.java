package Functional1;

/*
Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]
 */

import java.util.LinkedList;
import java.util.List;

public class RightDigit {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(22);
        list.add(93);

        RightDigit rightDigit = new RightDigit();
        System.out.println(rightDigit.rightDigit(list));
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll( n -> n % 10);
        return nums;
    }
}
