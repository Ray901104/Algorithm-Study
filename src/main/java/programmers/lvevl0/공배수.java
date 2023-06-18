package programmers.lvevl0;

public class 공배수
{
    public int solution(int number, int n, int m)
    {
        if(number % n == 0 && number % m == 0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args)
    {
        공배수 공배수 = new 공배수();
        int solution = 공배수.solution(60, 2, 3);
        System.out.println("solution = " + solution);
    }
}
