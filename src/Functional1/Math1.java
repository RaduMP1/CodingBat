package Functional1;

/*
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]
 */

import java.util.LinkedList;
import java.util.List;

public class Math1 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Math1 m1 = new Math1();
        System.out.println(m1.math1(list));
    }

    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n+1)*10 );
        return nums;
    }
}
