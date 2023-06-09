package programmers.lvevl0;

public class 문자열_섞기
{
    public String solution(String str1, String str2)
    {
        StringBuilder answer = new StringBuilder();
        String[] aStr = str1.split("");
        String[] bStr = str2.split("");

        for (int i = 0; i < str1.length(); i++)
        {
            answer.append(aStr[i]).append(bStr[i]);
        }

        return answer.toString();
    }

    public static void main(String[] args)
    {
        문자열_섞기 문자열_섞기 = new 문자열_섞기();
        String solution = 문자열_섞기.solution("aaaaa", "bbbbb");
        System.out.println("solution = " + solution);
    }
}
