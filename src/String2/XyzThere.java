package String2;

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */

public class XyzThere {

    public static void main(String[] args) {
        System.out.println(xyzThere("abc.xyzxyz"));
    }

    public static boolean xyzThere(String str) {
        int counterXyz = 0;
        int counterDotXyz = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith(".xyz", i)) counterDotXyz++;
            if (str.startsWith("xyz", i)) counterXyz++;
        }
        return counterXyz > counterDotXyz;
    }
}

/*   previous solution:
public boolean xyzThere(String str) {

for(int i = 0; i < str.length() - 2; i++) {
  if(str.charAt(i) == '.') i++;   // if "." then skip
  else if(str.substring(i, i+3).equals("xyz")) return true;
}
return false;
}
 */
