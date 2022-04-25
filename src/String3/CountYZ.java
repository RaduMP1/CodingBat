package String3;

/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an
alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
 */

public class CountYZ {

    public static void main(String[] args) {
        System.out.println(countYZ("DAY abc XYZ"));
    }

    public static int countYZ(String str) {
        int counter = 0;
        String smallCaps = str.toLowerCase();

        for (int i = 0; i < smallCaps.length() - 1; i++) {
            if ((smallCaps.charAt(i) == 'y' || smallCaps.charAt(i) == 'z') && !Character.isLetter(smallCaps.charAt(i + 1)))
                counter++;
        }
        if (smallCaps.endsWith("y") || smallCaps.endsWith("z")) counter++;
        return counter;
    }
}
