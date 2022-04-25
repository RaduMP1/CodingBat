package Warmup1;

/*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */

public class EveryNth {

    public static void main(String[] args) {
        System.out.println(everyNth("encyclopedia", 2));
    }

    public static String everyNth(String str, int n) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i=i+n) {
            newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }
}

/*
Solutia mea initiala (si a lor): >>> cea de mai sus e sugerata de IntelliJ: cu StringBuilder pt ca e mai memory-efficient decat creare de Stringuri in loop

public String everyNth(String str, int n) {
  String newStr = "";

  for (int i=0; i<str.length(); i = i + n) {
    newStr += str.charAt(i);
  }
  return newStr;
}
 */
