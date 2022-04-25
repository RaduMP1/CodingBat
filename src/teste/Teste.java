package teste;


//2, 2, 1, 1, 1, 2, 1, 1, 2, 2]


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Teste {

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();

//        map.put("a", "ab");
//        map.put("aa", "ac");
//        map.put("aaa", "bc");
//        map.remove("a");
//        map.put("ac", "xx");
//
//        if (map.containsKey(map.get("aa"))) System.out.println("eeee");
//        else System.out.println("ufff");
//
//
//        System.out.println(map);

        A p1 = new A(7);
        System.out.println(p1.x);
        A p2 = new A(p1);

        System.out.println(p1.x + p2.x);
        System.out.println(p1.x);
        System.out.println(p2.x);

    }
}

class A {
    int x;
    A(A p){
        p.x = 3;
        x = 9;
    }
    A(int x) {
        this.x = x;
    }
}

