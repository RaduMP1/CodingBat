package AP1;

/*
Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates.
A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B,
taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.

mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
 */


import java.util.Arrays;

public class MergeTwo {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeTwoV2(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3)));
    }


    //de pe net
    public static String[] mergeTwoV2(String[] a, String[] b, int n) {

        String[] arr = new String[n];
        int aIterator = 0;
        int bIterator = 0;

        for (int i = 0; i < n; i++) {
            if (a[aIterator].charAt(0) < b[bIterator].charAt(0)) {  //daca stringul din sirul a e mai mic decat cel din b
                arr[i] = a[aIterator];                              //atunci se adauga cel din a
                aIterator++;                                        //si progreseaza doar iteratorul de la a
            }
            else if (a[aIterator].charAt(0) > b[bIterator].charAt(0)) { //invers se adauga cel din b si progreseaza iteratorul de la b
                arr[i] = b[bIterator];
                bIterator++;
            } else {                       //daca cele 2 litere sunt egale (cel din sirul a cu cel din b) atunci se adauga cel de la a si progreseaza ambele iteratoare
                arr[i] = a[aIterator];
                aIterator++;
                bIterator++;
            }
        }
        return arr;
    }

    //versiunea scrisa de mine
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        // unirea celor 2 String array-uri
        String[] arr = new String[a.length + b.length];
        int iter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < a.length) arr[i] = a[i];
            else {
                arr[i] = b[iter];
                iter++;
            }
            System.out.println("arr[i] = " + arr[i]);
        }
        // rearanjarea in ordine alfabetica
        iter = 0;
        String temp = null;
        while (iter < arr.length-1) {
            if (arr[iter].charAt(0) > arr[iter + 1].charAt(0)) {
                temp = arr[iter];
                arr[iter] = arr[iter + 1];
                arr[iter + 1] = temp;
                iter = -1;
            }
            iter++;
        }
        System.out.println("arr[] = " + Arrays.toString(arr));
        //strig array-ul final
        iter = 0;
        String[] finalArr = new String[n];
        for (int i = 0; i < arr.length-1 && iter < n; i++) {
            if (arr[i].charAt(0) == arr[i+1].charAt(0)) i++;
            finalArr[iter] = arr[i];
            iter++;
        }

        return finalArr;
    }

}
