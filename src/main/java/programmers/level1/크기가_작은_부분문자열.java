package programmers.level1;

public class 크기가_작은_부분문자열
{
    public int solution(String t, String p)
    {
        int answer = 0;

        // 문자열 t에 대해 반복
        int pLeng = p.length();
        String newT = "";

        for (int i = 0; i <= t.length() - pLeng; i++)
        {
            // pLeng 단위로 자르기
            if(i == t.length() - pLeng)
            {
                newT = t.substring(i);
            }
            else
            {
                newT = t.substring(i, i + pLeng);
            }

            if(Long.parseLong(newT) <= Long.parseLong(p)) answer++;
        }

        return answer;
    }

    public static void main(String[] args)
    {
        크기가_작은_부분문자열 크기가_작은_부분문자열 = new 크기가_작은_부분문자열();
        int solution = 크기가_작은_부분문자열.solution("3141592", "271");
        System.out.println("solution = " + solution);
    }
}
