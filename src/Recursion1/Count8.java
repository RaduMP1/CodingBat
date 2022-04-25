package Recursion1;

/*
Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count8(8) → 1
count8(818) → 2
count8(8818) → 4
 */

public class Count8 {

    public static void main(String[] args) {
        System.out.println(count8(8088));
    }

    public static int count8(int n) {
        if (n == 0) return 0;
        if (n % 100 == 88) return 2 + count8(n / 10);   // cand sunt 2 de 8 lipiti, mai adauga 1 la numaratoare
        if (n % 10 == 8) return 1 + count8(n / 10);     // numara fiecare 8

        return count8(n / 10);
    }

    //de pe net
    public static int count8V2(int n) {
        if (n < 1) return 0;
        if (n % 10 == 8 && (n / 10) % 10 == 8) return 2 + count8V2(n/10);   //aici e diferit fatza de mine, ca au verificat cifra de langa 8, daca e tot 8 prin varianta " && (n / 10) % 10 == 8"
        else if (n % 10 == 8) return 1 + count8V2(n/10);
        else return count8V2(n/10);
    }
}
