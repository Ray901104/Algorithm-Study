package programmers.lvevl0;

public class flag에_따라_다른_값_반환하기
{
    public int solution(int a, int b, boolean flag)
    {
        if (flag)
            return a + b;
        else
            return a - b;
    }

    public static void main(String[] args)
    {
        flag에_따라_다른_값_반환하기 flag에_따라_다른_값_반환하기 = new flag에_따라_다른_값_반환하기();
        int solution = flag에_따라_다른_값_반환하기.solution(-4, 7, true);
        System.out.println("solution = " + solution);
    }
}
