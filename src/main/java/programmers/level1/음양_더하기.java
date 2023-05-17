package programmers.level1;

public class 음양_더하기
{
    public int solution(int[] absolutes, boolean[] signs)
    {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++)
        {
            if (signs[i])
            {
                sum += absolutes[i];
            }
            else
            {
                sum += (absolutes[i] * -1);
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        음양_더하기 음양_더하기 = new 음양_더하기();
        int solution = 음양_더하기.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true});
        System.out.println("solution = " + solution);

    }
}
