package programmers.level1;

public class 자연수_뒤집어_배열로_만들기
{
    public int[] solution(long n)
    {
        int[] answer = {};

        // 1. 입력받은 숫자를 문자열로 변환
        String str = Long.toString(n);

        // 2. 문자열 뒤집기
        String reversed = new StringBuilder(str).reverse().toString();

        // 3. 뒤집힌 문자열을 문자의 배열로 반환
        char[] arr = reversed.toCharArray();

        // 4. 배열의 각 문자를 정수로 변환
        answer = new int[arr.length];
        for (int i = 0; i < answer.length; i++)
            answer[i] = arr[i] - '0';

        return answer;
    }
}
