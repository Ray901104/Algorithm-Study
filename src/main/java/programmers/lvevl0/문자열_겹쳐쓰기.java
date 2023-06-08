package programmers.lvevl0;

public class 문자열_겹쳐쓰기
{
    public String solution(String my_string, String overwrite_string, int s)
    {
        String answer = "";
        String firstPart = my_string.substring(0, s);
        String lastPart = my_string.substring(s + overwrite_string.length());
        answer = firstPart + overwrite_string + lastPart;
        return answer;
    }

    public static void main(String[] args)
    {
        문자열_겹쳐쓰기 문자열_겹쳐쓰기 = new 문자열_겹쳐쓰기();
        String solution = 문자열_겹쳐쓰기.solution("He11oWor1d", "lloWorl", 2);
        System.out.println("solution = " + solution);
    }
}
