package String3;

/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string have
been removed (not case sensitive). You may assume that the remove string is length 1 or more.
Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 */

public class WithoutString {

    public static void main(String[] args) {
        System.out.println(withoutString("Hellollolloworllld", "Ll"));
    }

    public static String withoutString(String base, String remove) {
        String fin = "";

        for (int i = 0; i < base.length(); i++) {
            if (!(base.regionMatches(true,i,remove,0,remove.length()))) fin += base.charAt(i);
            else i = i + remove.length() - 1;       //ACHTUNG -- punem <<i = i + lungimea stringului 'remove' -1>> , pt ca il baga iar in loop si atunci face 'i++' si-l aduce pe pozitia care ne trebuie
        }
        return fin;

    }



    public String withoutString2(String base, String remove) {
        String str = "";
        int blen = base.length();
        int rlen = remove.length();

        for (int i = 0; i < blen; i++) {
            if (!(base.regionMatches(true, i, remove, 0, rlen))) str += base.charAt(i);
            if (base.regionMatches(true, i, remove, 0, rlen)) i = i + rlen - 1;
        }
        return str;
    }
}
