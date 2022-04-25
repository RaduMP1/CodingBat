package Functional2;

/*
Given a list of integers, return a list of the integers, omitting any that are less than 0.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(-2);
        list.add(3);

        System.out.println(noNeg(list));
        System.out.println(noNegV2(list));
    }

    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    //varianta cu 'stream' -- diferenta e ca creeaza o noua lista in care 'colecteaza' ce e mai mare ca zero / cea de mai sus, scoate din lista existenta ce e mai mic ca zero
    public static List<Integer> noNegV2(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
    }
}
