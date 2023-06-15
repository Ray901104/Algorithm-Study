package programmers.lvevl0;

public class 두_수의_연산값_비교하기
{
    public int solution(int a, int b)
    {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        int sum1 = Integer.parseInt(str1 + str2);
        int sum2 = 2 * a * b;

        return Math.max(sum1, sum2);
    }

    public static void main(String[] args)
    {
        두_수의_연산값_비교하기 두_수의_연산값_비교하기 = new 두_수의_연산값_비교하기();
        int solution = 두_수의_연산값_비교하기.solution(2, 91);
        System.out.println("solution = " + solution);
    }
}
