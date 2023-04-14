package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class 문자열_압축
{
    public int solution(String s)
    {
        int answer = 0;

        // 1부터 입력 문자열 s의 길이만큼 자를 문자열의 길이를 설정하며 반복
        int min = Integer.MAX_VALUE;
        for (int length = 1; length <= s.length(); length++)
        {
            // 문자열 압축 후 가장 짧은 길이 선택
            int compressed = compress(s, length);
            if(compressed < min)
                min = compressed;
        }
        answer = min;
        return answer;
    }

    // 문자열을 압축하고, 압축된 문자열의 길이를 반환하는 메서드
    private int compress(String source, int length)
    {
        StringBuilder builder = new StringBuilder();
        String last = "";
        int lastCnt = 0;
        for (String token : split(source, length))
        {
            // 압축 문자열 구성
            if (token.equals(last))
            {
                lastCnt++;
            }
            else
            {
                // 새로운 토큰 등장 처리
                if(lastCnt > 1) builder.append(lastCnt);
                builder.append(last);
                last = token;
                lastCnt = 1;
            }
        }
        if(lastCnt > 1) builder.append(lastCnt);
        builder.append(last);

        return builder.length();
    }

    // 문자열을 length 길이씩 잘라 리스트에 담아 주는 메서드
    private List<String> split(String source, int length)
    {
        List<String> tokens = new ArrayList<>();

        // source를 length만큼씩 잘라 tokens 리스트에 추가
        for (int startIndex = 0; startIndex < source.length(); startIndex += length)
        {
            // 문자열을 startIndex부터 잘라 tokens 리스트에 추가
            int endIndex = startIndex + length;
            if(endIndex > source.length()) endIndex = source.length();
            tokens.add(source.substring(startIndex, endIndex));
        }
        return tokens;
    }

    public static void main(String[] args)
    {
        문자열_압축 문자열_압축 = new 문자열_압축();
        int result = 문자열_압축.solution("xababcdcdababcdcd");
        System.out.println("result = " + result);
    }
}
