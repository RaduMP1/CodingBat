package Warmup2;

/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */

public class StringYak {

    public static void main(String[] args) {
        //System.out.println(stringYak("yak123ya"));
        System.out.println(stringYak2("yakabcyak"));
    }

    public static String stringYak(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("yak", i)) {
                if (i == str.length() - 3) break;
                i = i + 3;
            }
            newStr += str.charAt(i);
        }
        return newStr;
    }

    public static String stringYak2(String str) {   //their solution
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            System.out.println("before 'if' 'i' is: " + i);
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
                System.out.println("i+2: " + i);

            } else {    // i=i+2 face ca i sa mearga la 'k' >> else este esential, ca il trimite iar in loop sus, si apoi i trece mai departe si abia in loopul urmator ajunge in 'else'
                result += str.charAt(i);
                System.out.println("in else: result is: " + result);
            }
            System.out.println("******************");
        }
        return result;
    }
}