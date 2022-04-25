package Functional1;

/*
Given a list of strings, return a list where each string has all its "x" removed.

noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]
 */

import java.util.LinkedList;
import java.util.List;

public class NoX {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("ax");
        list.add("bb");
        list.add("cx");
        list.add("xxxxxxxxy");

        NoX noX1 = new NoX();
        System.out.println(noX1.noX(list));
    }

    public List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replaceAll("x", ""));
        return strings;
    }
}
