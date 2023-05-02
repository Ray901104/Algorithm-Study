package programmers.level1;

public class 소수_만들기
{
    public int solution(int[] nums)
    {
        int answer = 0;
        boolean isPrime = false;

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                for (int k = j + 1; k < nums.length; k++)
                {
                    int num = nums[i] + nums[j] + nums[k];
                    if(num >= 2)
                        isPrime = prime(num);
                    if(isPrime)
                        answer++;
                }
            }
        }

        return answer;
    }
    private boolean prime(int num)
    {
        boolean isPrime = true;
        if(num == 2)
            return isPrime;

        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args)
    {
        소수_만들기 소수_만들기 = new 소수_만들기();
        int solution = 소수_만들기.solution(new int[]{1, 2, 3, 4});
        System.out.println("solution = " + solution);
    }
}
