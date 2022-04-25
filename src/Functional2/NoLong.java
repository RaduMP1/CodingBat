package Functional2;

/*
Given a list of strings, return a list of the strings, omitting any string length 4 or more.

noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NoLong {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("this");
        list.add("not");
        list.add("too");
        list.add("long");

        System.out.println(noLongV2(list));
    }

    public static List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() >= 4);
        return strings;
    }

    //versiunea cu stream();
    public static List<String> noLongV2(List<String> strings) {
        return strings.stream().filter(n -> n.length() < 4).collect(Collectors.toList());
    }
}
