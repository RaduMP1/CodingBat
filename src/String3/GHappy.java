package String3;

/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
 */

public class GHappy {

    public static void main(String[] args) {
        System.out.println(gHappy("abc"));
    }

    public static boolean gHappy(String str) {
        if (!(str.contains("g"))) return true;
        //identify if string has only 1 character OR identify single 'g' in the beginning or end of string
        if (str.length()==1 || (str.charAt(0) == 'g' && str.charAt(1) != 'g') || (str.charAt(str.length()-2) != 'g' && str.charAt(str.length()-1) == 'g')) return false;

        //identify single 'g' in the content of string
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i) == 'g' && (str.charAt(i-1) != 'g' && str.charAt(i+1) != 'g')) return false;
        }
        return true;
    }
}
