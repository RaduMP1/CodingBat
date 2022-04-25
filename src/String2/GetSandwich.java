package String2;

/*
A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 */

public class GetSandwich {

    public static void main(String[] args) {
        System.out.println(getSandwich("xxbread123breadaaaaaaaaaaaaaaaaaaa"));
    }

    public static String getSandwich(String str) {

        String strNew = "";

        for (int i = str.indexOf("bread") + 5; i < str.lastIndexOf("bread"); i++) {
            strNew += str.charAt(i);
        }

        return strNew;
    }

    // the version that broke the solution on the site if using too many characters after the last 'bread'. for example: str =  xxbread123breadaaaaaaaaaaaaaaaaaaa
    public static String getSandwich2(String str) {
        if (str.length() <= 10) return "";
        String str2 = "";

        for (int i = str.indexOf("bread"); i < str.length() - str.indexOf("bread"); i++) {
            if (str.startsWith("bread", i)) i = i + 5;
            if (i >= str.length() - str.indexOf("bread")) break;
            str2 += str.charAt(i);
        }
        System.out.println("length: " + str.length());
        System.out.println("index of bread: " + str.indexOf("bread"));
        System.out.println("length - index of bread: " + (str.length() - str.indexOf("bread")));
        return str2;
    }

}




