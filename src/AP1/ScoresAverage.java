package AP1;

/*
Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger.
We'll say that the second half begins at index length/2. The array length will be at least 2.
To practice decomposition, write a separate helper method int average(int[] scores, int start, int end)
{ which computes the average of the elements between indexes start..end.
Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area.
Normally you would compute averages with doubles, but here we use ints so the expected results are exact.

scoresAverage([2, 2, 4, 4]) → 4
scoresAverage([4, 4, 4, 2, 2, 2]) → 4
scoresAverage([3, 4, 5, 1, 2, 3]) → 4
 */

public class ScoresAverage {

    public static void main(String[] args) {
        System.out.println(scoresAverageV2(new int[]{2,2,4,4}));
    }


    public static int scoresAverageV2(int[] scores) {
        int half = scores.length/2;
        int firstAverage = average(scores, 0, half);
        int secondAverage = average(scores, half, scores.length);

        return Math.max(firstAverage,secondAverage);
    }


    public static int average(int[] scores, int start, int end){

        int average = 0;
        int iterator = 0;

        for (int i = start; i < end; i++) {
            average += scores[i];
            iterator++;
        }

        return average / iterator; // in loc de variabila iterator se poate folosi (end - start)
    }








    public static int scoresAverage(int[] scores) {

        int half = scores.length/2;
        int firstAverage = 0;
        int secondAverage = 0;

        for (int i = 0; i < half; i++) {
            firstAverage += scores[i];
        }
        for (int i = half; i < scores.length; i++) {
            secondAverage += scores[i];
        }
        return Math.max(firstAverage,secondAverage) / half;
    }
}
