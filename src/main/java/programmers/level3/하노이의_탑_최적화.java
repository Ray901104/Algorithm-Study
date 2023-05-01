package programmers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 하노이의_탑_최적화
{
    public int[][] solution(int n)
    {
        List<int[]> process = new ArrayList<>();
        hanoi(n, 1, 3, process);
        return process.toArray(new int[0][]);
    }

    private void hanoi(int n, int from, int to, List<int[]> process)
    {
        if (n == 1)
        {
            process.add(new int[]{from, to});
            return;
        }

        int empty = 6 - from - to;

        hanoi(n - 1, from, empty, process);
        hanoi(1, from, to, process);
        hanoi(n - 1, empty, to, process);
    }

    public static void main(String[] args)
    {
        하노이의_탑_최적화 하노이의_탑 = new 하노이의_탑_최적화();
        int[][] solution = 하노이의_탑.solution(2);
        System.out.println("solution = " + Arrays.deepToString(solution));
    }
}
