package programmers.level2;

import java.util.Arrays;

public class 이진_변환_반복하기
{
    public int[] solution(String s)
    {
        int[] answer = new int[2];
        int replaceCount = 0; // 이진 변환 횟수
        int zeroCount = 0; // 제거된 0의 개수


        while (!s.equals("1"))
        {
            StringBuilder sb = new StringBuilder();
            for (char chars : s.toCharArray())
            {
                if (chars == '0')
                {
                    zeroCount++;
                    continue;
                }
                sb.append(chars);
            }
            replaceCount++;
            s = Integer.toString(sb.toString().length(), 2);
        }
        // 이진 변환 횟수와 제거된 0의 개수를 배열에 담아 반환
        answer[0] = replaceCount;
        answer[1] = zeroCount;

        return answer;
    }

    public static void main(String[] args)
    {
        이진_변환_반복하기 이진_변환_반복하기 = new 이진_변환_반복하기();
        int[] solution = 이진_변환_반복하기.solution("1111111");
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
