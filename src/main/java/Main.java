import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class Main
{
    public String solution(String S)
    {
        String answer = "";

        // 괄호의 종류 받기
        String[] strArr = S.split("");

        // 괄호의 짝 검사

        return answer;
    }

    private boolean isValidPare(String[] strings)
    {
        // 문자열 배열의 크기가 홀수이면 거짓
        if(strings.length % 2 != 0)
            return false;

        for (int i = 0; i < strings.length; i++)
        {
            if(strings[i].equals("("))
                return existPare(strings, "(");
            if(strings[i].equals("{"))
                return existPare(strings, "{");
            if(strings[i].equals("["))
                return existPare(strings, "[");
        }

        return false;
    }

    private boolean existPare(String[] strings, String onePare)
    {
        boolean result = false;
        String whichPare = "";

        switch (onePare)
        {
            case "(":
                whichPare = ")";
                break;
            case "{":
                whichPare = "}";
                break;
            case "[":
                whichPare = "]";
                break;
            default:
                break;
        }

        for (int i = 0; i < strings.length; i++)
        {
            if(strings[i].equals(whichPare))
                strings[i] = "";
                return true;
        }

        return result;
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.solution("(){()}[]");
    }
}
