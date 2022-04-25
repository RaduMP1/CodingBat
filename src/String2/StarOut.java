package String2;

/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its
left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */

public class StarOut {

    public static void main(String[] args) {
        System.out.println(starOut2("ab*"));
    }


    //old solution (better)
    public static String starOut2(String str) {
        int len = str.length();
        String finalString = "";
        int iteration = 0;

        for (int i = 0; i < len; i++) {
            System.out.println("\n" + "iteration " + iteration++);

            if (i == 0 && str.charAt(i) != '*')
                finalString += str.charAt(i);

            if (i > 0 && str.charAt(i-1) != '*' && str.charAt(i) != '*')
                finalString += str.charAt(i);

            if (i > 0 && str.charAt(i-1) != '*' && str.charAt(i) == '*')
                finalString = finalString.substring(0, finalString.length() - 1);

            System.out.println(finalString);
        }


        return finalString;
    }

    //solutia ineficienta gasita de mine
    public static String starOut(String str) {

        if (str.length() < 3 && str.contains("*")) return "";
        if (str.length() == 3 && str.contains("*") && !(str.startsWith("*")) && !(str.endsWith("*"))) return "";
        if (str.endsWith("*")) return str.substring(0, str.length() - 2);


        String newStr = "";
        String newStr2 = "";
        String newStr3 = "";
        String finalStr = "";

        //leave just 1 star
        for (int i = 0; i < str.length(); i++) {
            while (str.startsWith("**", i)) i++;
            newStr += str.charAt(i);
        }

        //remove item to the left of star
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.startsWith("*", i + 1)) i++;
            newStr2 += newStr.charAt(i);
        }

        //remove item to the right of star
        for (int i = 0; i < newStr2.length(); i++) {
            if (newStr2.startsWith("*", i - 1)) i++;
            newStr3 += newStr2.charAt(i);
        }

        //removing stars
        for (int i = 0; i < newStr3.length(); i++) {
            while (newStr3.startsWith("*", i)) i++;
            finalStr += newStr3.charAt(i);
        }


        System.out.println(newStr);
        System.out.println(newStr2);
        System.out.println(newStr3);

        return finalStr;
    }
}


