package programmers.lvevl0;

public class n의_배수
{
    public int solution(int num, int n)
    {
        if (num % n == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        n의_배수 n의_배수 = new n의_배수();
        int solution = n의_배수.solution(34, 3);
        System.out.println("solution = " + solution);
    }
}
