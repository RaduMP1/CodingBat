package Functional2;

/*
Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class No34 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("bb");
        list.add("ccc");

        System.out.println(no34V2(list));
    }

    public static List<String> no34(List<String> strings) {
        strings.removeIf(n -> n.length() == 3 || n.length() == 4);
        return strings;
    }

    //varianta cu stream()
    public static List<String> no34V2(List<String> strings) {
        return strings.stream().filter(n -> n.length() != 3 && n.length() != 4).collect(Collectors.toList());
    }
}
