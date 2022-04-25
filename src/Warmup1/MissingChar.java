package Warmup1;

/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */

public class MissingChar {

    public static void main(String[] args) {
        System.out.println(missingChar("mimi", 3));
    }

    public static String missingChar(String str, int n) {

//        if (n ==0) return str.substring(n+1);
//        if (n > 0 && n < str.length()-1) return str.substring(0,n) + str.substring(n+1);
//        return str.substring(0,n);


        //solutia lor
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());

        return front + back;
    }
}
