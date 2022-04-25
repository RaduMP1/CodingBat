package Warmup2;

/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */

public class AltPairs {

    public static void main(String[] args) {
        //System.out.println(altPairs("yak"));
        System.out.println(altPairsMetodaLor("Chocolate"));
    }

    public static String altPairs(String str) {
        if (str.length() <= 2) return str;
        if (str.length() <= 5) return str.substring(0,2);
        String pare = "";
        String impare = "";
        String result = "";
        for (int i = 0; i < str.length(); i=i+4) pare += str.charAt(i);
        System.out.println(pare);
        for (int i = 1; i < str.length(); i=i+4) impare += str.charAt(i);
        System.out.println(impare);

        for (int i = 0; i < Math.min(pare.length(),impare.length()); i++) {
            result += pare.substring(i,i+1) + impare.substring(i,i+1);

        }

        if (str.length() % 2 != 0) return result + pare.charAt(pare.length()-1);
        return result;
    }

    // solutia lor -- mult superioara fata de a mea
    public static String altPairsMetodaLor (String str) {
        String result = "";
        for (int i = 0; i < str.length(); i+= 4) {
            int end = i + 2;
            if (end > str.length()) end = str.length(); // aici e cheia: daca 'end' e dupa sfarsitul stringului, atunci 'end' ia valoarea sfarsitului stringului -- si acum poti sa iterezi fara sa mai ai indexoutofbounds error
            result += str.substring(i,end);
        }
        return result;
    }
}
