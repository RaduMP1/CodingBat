package Functional1;

/*
Given a list of strings, return a list where each string has "y" added at its start and end.

moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
 */

import java.util.LinkedList;
import java.util.List;

public class MoreY {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        //in varianta in care NU fac statica metoda moreY, atunci creez un obiect de tip Morey si accesez prin el metoda moreY
        MoreY m1 = new MoreY();
        System.out.println(m1.moreY(list));
    }

    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y" + n + "y");
        return strings;
    }

}
