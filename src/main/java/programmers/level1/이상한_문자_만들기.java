package programmers.level1;

public class 이상한_문자_만들기
{
    public String solution(String s)
    {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean toUpper = true; // 대문자로 변환해야하는지 여부를 판단하는 플래그

        for (char c : s.toCharArray())
        {
            // 공백인 경우
            if (!Character.isAlphabetic(c))
            {
                sb.append(c);
                toUpper = true;
            }
            else
            {
                if (toUpper)
                {
                    sb.append(Character.toUpperCase(c));
                }
                else
                {
                    sb.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args)
    {
        이상한_문자_만들기 이상한_문자_만들기 = new 이상한_문자_만들기();
        String try_hello_world = 이상한_문자_만들기.solution("try hello world");
        System.out.println("try_hello_world = " + try_hello_world);
    }
}
