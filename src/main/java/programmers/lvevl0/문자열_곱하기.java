package programmers.lvevl0;

public class 문자열_곱하기
{
    public String solution(String my_string, int k)
    {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < k; i++)
        {
            answer.append(my_string);
        }

        return answer.toString();
    }

    public static void main(String[] args)
    {
        문자열_곱하기 문자열_곱하기 = new 문자열_곱하기();
        String solution = 문자열_곱하기.solution("string", 3);
        System.out.println("solution = " + solution);
    }
}
