package programmers.lvevl0;

public class 등차수열의_특정한_항만_더하기
{
    public int solution(int a, int d, boolean[] included)
    {
        int answer = 0;
        int[] sequence = new int[included.length];
        sequence[0] = a;
        for (int i = 1; i < included.length; i++)
        {
            sequence[i] = sequence[i-1] + d;
        }

        for (int i = 0; i < sequence.length; i++)
        {
            if (included[i])
            {
                answer += sequence[i];
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        등차수열의_특정한_항만_더하기 등차수열의_특정한_항만_더하기 = new 등차수열의_특정한_항만_더하기();
        int solution = 등차수열의_특정한_항만_더하기.solution(3, 4, new boolean[]{true, false, false, true, true});
        System.out.println("solution = " + solution);
    }
}
