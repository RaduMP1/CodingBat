package Functional2;

/*
Given a list of integers, return a list of those numbers squared and the product added to 10,
omitting any of the resulting numbers that end in 5 or 6.

square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Square56 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        System.out.println(square56V2(list));
    }

    public static List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> n * n + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }

    //varianta cu stream()
    public static List<Integer> square56V2(List<Integer> nums) {
        return nums.stream().map(n -> n * n + 10).filter(n -> n % 10 != 5 && n % 10 != 6).collect(Collectors.toList());
    }
}
