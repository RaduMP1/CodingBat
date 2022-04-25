package Functional1;

/*
Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).

lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 */

import java.util.LinkedList;
import java.util.List;

public class Lower {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("Hi");
        list.add("AAA");

        Lower lower1 = new Lower();
        System.out.println(lower1.lower(list));
    }

    public List<String> lower(List<String> strings) {
//        strings.replaceAll(String::toLowerCase); // varianta sugerata de intelliJ: method reference
        strings.replaceAll(n -> n.toLowerCase());
        return strings;
    }
}
