package String2;

/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
 */

public class SameStarChar {

    public static void main(String[] args) {
        System.out.println(sameStarChar("*xa*az"));
    }

    public static boolean sameStarChar(String str) {
        int starCounter = 0;
        int match = 0;

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                starCounter++;
                if (str.charAt(i - 1) == str.charAt(i + 1)) match++;
            }

        }
        return starCounter == match;
    }
}

/* ------- their solution:
public boolean sameStarChar(String str) {

  for (int i=1; i<str.length()-1; i++) {
    if (str.charAt(i) == '*') {
      if (str.charAt(i-1) != str.charAt(i+1)) return false;
    }
  }
  return true;
}
*/
