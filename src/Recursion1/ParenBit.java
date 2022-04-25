package Recursion1;

/*
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
 */

public class ParenBit {

    public static void main(String[] args) {
        System.out.println(parenBit("z(abc)1"));

    }

    public static String parenBit(String str) {
        if (str.startsWith("(")) {
            if (str.endsWith(")")) return str;                          //daca incepe cu ( si se termina cu ) atunci sa ne dea stringul efectiv
            else return parenBit(str.substring(0, str.length() - 1));   //daca nu se termina cu ), atunci facem recursiune pe metoda si taiem cate un caracter din coada
        }
        return parenBit(str.substring(1));      //taiem cate un caracter din fata
    }

    //versiunea de pe codingbat -- cumva mai usor de inteles
    public static String parenBitV2(String str) {
        if (str.charAt(0) != '(') return parenBitV2(str.substring(1));                              //daca NU incepe cu '(' atunci fac recursiune si taie cate un caracter din fatza
        if (str.charAt(str.length()-1) != ')') return parenBitV2(str.substring(0,str.length()-1));  //daca NU se termina cu ')' atunci fac recursiune si taie cate un caracter din spate
        return str;
    }
}
