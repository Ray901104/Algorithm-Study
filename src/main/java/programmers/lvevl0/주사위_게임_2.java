package programmers.lvevl0;

public class 주사위_게임_2
{
    public int solution(int a, int b, int c)
    {
        double powerdSum = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
        if (a == b && b == c)
        {
            return (int) ((a + b + c) * powerdSum * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        }
        else if (a != b && b != c && c != a)
        {
            return a + b + c;
        }
        else
        {
            return (int) ((a + b + c) * powerdSum);
        }
    }

    public static void main(String[] args)
    {
        주사위_게임_2 주사위_게임_2 = new 주사위_게임_2();
        int solution = 주사위_게임_2.solution(4, 4, 4);
        System.out.println("solution = " + solution);
    }
}
