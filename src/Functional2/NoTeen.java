package Functional2;

/*
Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(19);
        list.add(20);

        System.out.println(noTeen(list));
        System.out.println(noTeenV2(list));
    }

    public static List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }

    //varianta cu stream()
    public static List<Integer> noTeenV2(List<Integer> nums) {
        return nums.stream().filter(n -> n < 13 || n > 19).collect(Collectors.toList());
    }
}
