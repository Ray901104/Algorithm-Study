package programmers.lvevl0;

public class 문자_리스트를_문자열로_변환하기
{
    public String solution(String[] arr)
    {
        StringBuilder answer = new StringBuilder();
        for (String str : arr)
        {
            answer.append(str);
        }

        return answer.toString();
    }

    public static void main(String[] args)
    {
        문자_리스트를_문자열로_변환하기 문자_리스트를_문자열로_변환하기 = new 문자_리스트를_문자열로_변환하기();
        String solution = 문자_리스트를_문자열로_변환하기.solution(new String[]{"a", "b", "c"});
        System.out.println("solution = " + solution);
    }
}
