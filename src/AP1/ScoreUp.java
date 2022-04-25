package AP1;

/*
The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
the "answers" array contains a student's answers, with "?" representing a question left blank.
The two arrays are not empty and are the same length. Return the score for this array of answers,
giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.

scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
 */

public class ScoreUp {

    public static void main(String[] args) {
        System.out.println(scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "?"}));
    }

    public static int scoreUp(String[] key, String[] answers) {

        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) score += 4;
            else if (!answers[i].equals("?")) score -= 1; // obs. dupa else nu mai e nevoie sa punem negarea conditiei din randul de mai sus, ci doar ce avem de adaugat in plus: ca difera de "?"
        }
        return score;
    }
}
