package Functional2;

/*
Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class No9 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(19);

        System.out.println(no9(list));
        System.out.println(no9V2(list));
    }

    public static List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }

    //varianta cu stream()
    public static List<Integer> no9V2(List<Integer> nums){
        return nums.stream().filter(n -> n % 10 != 9).collect(Collectors.toList());
    }
}
