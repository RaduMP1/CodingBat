package String1;

/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string,
such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */

public class FrontAgain {

    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
    }

    public static boolean frontAgain(String str) {
        return str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }
}

/*
Solutia lor:
public boolean frontAgain(String str) {
  if (str.length() < 2) {
    return false;  // screen out the short-length case
  }

  String front = str.substring(0, 2);
  String back = str.substring(str.length()-2);
  return(front.equals(back));
}
 */
