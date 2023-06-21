package programmers.lvevl0;

public class 조건_문자열
{
    public int solution(String ineq, String eq, int n, int m)
    {
        if (ineq.equals(">"))
        {
            if (eq.equals("=") && (n >= m))
            {
                return 1;
            }
            else if(!eq.equals("=") && (n > m))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if (eq.equals("=") && (n <= m))
            {
                return 1;
            }
            else if(!eq.equals("=") && (n < m))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }

    public static void main(String[] args)
    {
        조건_문자열 조건_문자열 = new 조건_문자열();
        int solution = 조건_문자열.solution(">", "!", 41, 78);
        System.out.println("solution = " + solution);
    }
}
