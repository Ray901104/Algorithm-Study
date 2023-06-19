package programmers.lvevl0;

public class 홀짝에_따라_다른_값_반환하기
{
    public int solution(int n)
    {
        int oddSum = 1;
        int evenSum = 4;
        if (n % 2 != 0)
        {
            int i = 1;
            while (i < n)
            {
                i += 2;
                oddSum += i;
            }
            return oddSum;
        }
        else
        {
            int i = 2;
            while (i < n)
            {
                i += 2;
                evenSum += (i * i);
            }
            return evenSum;
        }
    }

    public static void main(String[] args)
    {
        홀짝에_따라_다른_값_반환하기 홀짝에_따라_다른_값_반환하기 = new 홀짝에_따라_다른_값_반환하기();
        int solution = 홀짝에_따라_다른_값_반환하기.solution(10);
        System.out.println("solution = " + solution);
    }
}
