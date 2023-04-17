package programmers.level1;

public class 문자열_내_p와_y의_개수
{
    boolean solution(String s)
    {
        boolean answer = true;
        int p = 0;
        int y = 0;

        // 문자열 s에 대해 반복
        for (char c : s.toCharArray())
        {
            if(c == 'p' || c == 'P')
                p++;
            else if(c == 'y' || c == 'Y')
                y++;
        }
        answer = (p == y);
        return answer;
    }

    public static void main(String[] args)
    {
        문자열_내_p와_y의_개수 문자열_내_p와_y의_개수 = new 문자열_내_p와_y의_개수();
        boolean pPoooyY = 문자열_내_p와_y의_개수.solution("Pyy");
        System.out.println("Pyy = " + pPoooyY);
    }
}
