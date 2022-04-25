package Functional2;

/*
Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings
that contain "yy" as a substring anywhere.

noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NoYY {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("yyx");
        list.add("b");
        list.add("xx");
        System.out.println(noYYV2(list));
    }

    public static List<String> noYY(List<String> strings) {
        strings.replaceAll(n -> n + "y");
        strings.removeIf(n -> n.contains("yy"));
        return strings;
    }

    //varianta cu stream
    public static List<String> noYYV2(List<String> strings) {
        return strings.stream().map(n -> n + "y").filter(n -> !n.contains("yy")).collect(Collectors.toList());
    }
}
