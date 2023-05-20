package programmers.level1;

import java.util.Arrays;

public class 과일_장수
{
    public int solution(int k, int m, int[] score)
    {
        int answer = 0;
        Arrays.sort(score);

        for (int i = score.length - 1; i >= 0; i--)
        {
            if((score.length - i) % m == 0) answer += score[i] * m;
        }

        return answer;
    }

    public static void main(String[] args)
    {
        과일_장수 과일_장수 = new 과일_장수();
        int solution = 과일_장수.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println("solution = " + solution);
    }
}
