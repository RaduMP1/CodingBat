package Logic2;

/*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
 */

public class MakeChocolate {

    public static void main(String[] args) {
        System.out.println(makeChocolate(4,1,9));
    }

    public static int makeChocolate(int small, int big, int goal) {
        int smallBarsToUse = 0;
        if (big * 5 < goal) {
            smallBarsToUse = goal - big * 5;
            if (smallBarsToUse > small) return -1;
        } else {
            smallBarsToUse = goal % 5;
            if (smallBarsToUse > small) return -1;
        }
        return smallBarsToUse;
    }

    public int makeChocolate2(int small, int big, int goal) { // my old solution
        int a = (goal-5*big);
        if (a<=small && a>=0) return a;
        if (a<0 && goal%5<=small) return goal%5;
        return -1;
    }
}
