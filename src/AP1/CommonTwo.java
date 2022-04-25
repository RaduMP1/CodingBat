package AP1;

/*
Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass
over both arrays, taking advantage of the fact that they are in alphabetical order.

commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
 */

public class CommonTwo {

    public static void main(String[] args) {
        System.out.println(commonTwoV3(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}));
    }

    public static int commonTwo(String[] a, String[] b) {

        int aIterator = 0;
        int bIterator = 0;
        int count = 0;
        String temp = "";

        while (aIterator < a.length && bIterator < b.length) {
            if (a[aIterator].equals(b[bIterator])) {
                if (temp.equals(a[aIterator])) count--;
                count++;
                temp = a[aIterator];
                aIterator++;
                bIterator++;
            } else if (a[aIterator].charAt(0) < b[bIterator].charAt(0)) aIterator++;
            else bIterator++;
        }
        return count;
    }

    //tot de mine facuta, cu 2 loop-uri
    public static int commonTwoV2(String[] a, String[] b) {

        int count = 0;
        String temp = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    if (temp.equals(a[i])) count--;
                    count++;
                    temp = a[i];
                }
            }
        }
        return count;
    }

    //de pe net -- utilizand metoda 'contains()'
    public static int commonTwoV3(String[] a, String[] b) {
        int count = 0;
        String str = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j]) && !str.contains(b[j])) {
                    str += b[j];
                    count++;
                }
            }
        }
        return count;
    }
}
