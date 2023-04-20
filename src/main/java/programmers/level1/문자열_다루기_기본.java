package programmers.level1;

public class 문자열_다루기_기본
{
    public boolean solution(String s)
    {
        boolean answer = true;

        // 정규식을 이용하여 해결
        answer = s.matches("[0-9]{4}|[0-9]{6}");

        return answer;
    }

    public static void main(String[] args)
    {
        문자열_다루기_기본 문자열_다루기_기본 = new 문자열_다루기_기본();
        boolean a234 = 문자열_다루기_기본.solution("a234");
        System.out.println("a234 = " + a234);
    }
}
