package programmers.level1;

public class 시저_암호
{
    public String solution(String s, int n)
    {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
        {
            sb.append(push(c, n));
        }
        answer = sb.toString();
        return answer;
    }

    private char push(char c, int n)
    {
        // 알파벳이 아닌 경우 문자를 그대로 이어 붙이기
        if (!Character.isAlphabetic(c)) return c;

        // c를 n만큼 밀어 반환
        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);

        return (char) (offset + position);
    }

    public static void main(String[] args)
    {
        시저_암호 시저_암호 = new 시저_암호();
        String result = 시저_암호.solution("a B z", 4);
        System.out.println("result = " + result);
    }
}
