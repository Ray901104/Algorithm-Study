package programmers.lvevl0;

public class 원소들의_곱과_합
{
    public int solution(int[] num_list)
    {
        // 원소들의 곱
        int mult = 1;
        int sum = 0;
        for (int num : num_list)
        {
            mult *= num;
            sum += num;
        }
        return mult < (sum * sum) ? 1 : 0;
    }

    public static void main(String[] args)
    {
        원소들의_곱과_합 원소들의_곱과_합 = new 원소들의_곱과_합();
        int solution = 원소들의_곱과_합.solution(new int[]{3, 4, 5, 2, 1});
        System.out.println("solution = " + solution);
    }
}
