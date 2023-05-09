package programmers.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 모의고사
{
    private static final int[][] RULES = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    public int[] solution(int[] answers)
    {
        int[] corrects = new int[3];
        int max = 0;

        for (int problem = 0; problem < answers.length; problem++)
        {
            for (int person = 0; person < 3; person++)
            {
                int answer = answers[problem];
                int picked = getPicked(person, problem);
                if (answer == picked)
                {
                    if(++corrects[person] > max)
                    {
                        max = corrects[person];
                    }
                }
            }
        }

        final int maxCorrects = max;

        return IntStream.range(0, 3)
                .filter(i -> corrects[i] == maxCorrects)
                .map(i -> i +1)
                .toArray();
    }

    private int getPicked(int person, int problem)
    {
        int[] rule = RULES[person];
        int index = problem % rule.length;
        return rule[index];
    }

    public static void main(String[] args)
    {
        모의고사 모의고사 = new 모의고사();
        int[] solution = 모의고사.solution(new int[]{1, 3, 2, 4, 2});
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
