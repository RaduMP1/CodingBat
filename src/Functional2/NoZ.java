package Functional2;

/*
Given a list of strings, return a list of the strings, omitting any string that contains a "z".
(Note: the str.contains(x) method returns a boolean)

noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NoZ {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("aza");
        list.add("bbb");

        System.out.println(noZV2(list));
    }

    public static List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

    //versiunea cu stream()
    public static List<String> noZV2(List<String> strings) {
        return strings.stream().filter(n -> !n.contains("z")).collect(Collectors.toList());
    }
}
