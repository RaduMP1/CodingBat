package Warmup2;

/*

Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */

public class StringSplosion {

    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
    }

    public static String stringSplosion(String str) {
        String newStr = "";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.charAt(i);
            result += newStr;
        }
        return result;
    }
}

/*
Solutia lor:
public String stringSplosion(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
    result = result + str.substring(0, i+1);
  }
  return result;
}
 */
