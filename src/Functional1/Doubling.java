package Functional1;

/*
Given a list of integers, return a list where each integer is multiplied by 2.

doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(doubling(list));
        System.out.println(doublingV2(list));
    }

    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    //solutia cu java streams (creeaza o noua lista spre deosebire de cea de mai sus care re-scrie lista existenta)
    public static List<Integer> doublingV2(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());
    }
}
