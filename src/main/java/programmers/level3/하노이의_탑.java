package programmers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 하노이의_탑
{
    public int[][] solution(int n)
    {
        return hanoi(n, 1, 3).toArray(new int[0][]);
    }

    private List<int[]> hanoi(int n, int from, int to)
    {
        if (n == 1) return List.of(new int[]{from, to});

        int empty = 6 - from - to;

        List<int[]> result = new ArrayList<>();
        result.addAll(hanoi(n - 1, from, empty));
        result.addAll(hanoi(1, from, to));
        result.addAll(hanoi(n - 1, empty, to));

        return result;
    }

    public static void main(String[] args)
    {
        하노이의_탑 하노이의_탑 = new 하노이의_탑();
        int[][] solution = 하노이의_탑.solution(2);
        System.out.println("solution = " + Arrays.deepToString(solution));
    }
}
