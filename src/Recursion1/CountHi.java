package Recursion1;

/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
 */

public class CountHi {

    public static void main(String[] args) {
        System.out.println(countHiV2("xhixhix"));
    }

    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0,2).equals("hi")) return 1 + countHi(str.substring(1));
        return countHi(str.substring(1));
    }

    //de pe codingbat
    public static int countHiV2(String str) {
        if (str.length() <= 1) return 0;
        int count = 0;                                      //introduce un counter (asa cum am incercat eu in alte exercitii anterioare si nu mi-a iesit
        if (str.substring(0, 2).equals("hi")) count = 1;    // daca e "hi" atunci counterul devine 1 (Obs: nu se incrementeaza cu 1, (adica +=1) ci doar devine = 1)
        return count + countHiV2(str.substring(1));         //returneaza countul + recursia >>> daca a descoperit un 'hi' countul va fi 1, daca nu, va fi 0
    }
}
