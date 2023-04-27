package programmers.level1;

public class 삼총사
{
    public int solution(int[] number)
    {
        int answer = 0;

        for (int i = 0; i < number.length - 2; i++)
        {
            for (int j = i+1; j < number.length - 1; j++)
            {
                for (int k = j + 1; k < number.length; k++)
                {
                    if(number[i] + number[j] + number[k] == 0)
                        answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args)
    {
        삼총사 삼총사 = new 삼총사();
        int solution = 삼총사.solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println("solution = " + solution);
    }
}
