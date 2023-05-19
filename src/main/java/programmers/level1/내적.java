package programmers.level1;

public class 내적
{
    public int solution(int[] a, int[] b)
    {
        int sum = 0;
        for (int i = a.length; i > 0; i--)
        {
            sum += a[i - 1] * b[i - 1];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        내적 내적 = new 내적();
        int solution = 내적.solution(new int[]{-1, 0, 1}, new int[]{1, 0, -1});
        System.out.println("solution = " + solution);
    }
}
