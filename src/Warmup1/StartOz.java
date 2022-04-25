package Warmup1;

/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */

public class StartOz {

    public static void main(String[] args) {
        System.out.println(startOz("oxx"));
    }

    public static String startOz(String str) {
//        if (str.length() >= 2) {
//            if (str.startsWith("oz")) return "oz";
//            if (str.charAt(0) == 'o' && str.charAt(1) != 'z') return "o";
//            if (str.charAt(0) != 'o' && str.charAt(1) == 'z') return "z";
//        }
//        if (str.equals("o")) return "o";
//        return "";


        //solutia lor -- mai buna
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);    //metoda geniala prin care fenteaza si poate sa dea stringului caracterul 'o'. Daca scria doar restul = str.charAt(0) atunci nu-i dadea voie
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }
}
