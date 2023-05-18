package programmers.level1;

public class 약수의_개수와_덧셈
{
    public int solution(int left, int right)
    {
        int cnt;
        int sum = 0;
        for (int i = left; i <= right; i++)
        {
            cnt = 0;
            for (int j = 1; j <= i; j++)
            {
                if(i % j == 0) cnt++;
            }

            if (cnt % 2 != 0)
            {
                i = i * -1;
            }
            sum += i;
            i = Math.abs(i);
        }

        return sum;
    }

    public static void main(String[] args)
    {
        약수의_개수와_덧셈 약수의_개수와_덧셈 = new 약수의_개수와_덧셈();
        int solution = 약수의_개수와_덧셈.solution(13, 17);
        System.out.println("solution = " + solution);
    }
}
