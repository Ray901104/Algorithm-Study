package programmers.level1;

public class 삼진법_뒤집기
{
    public int solution(int n)
    {
        int answer = 0;

        // 정수를 3진법으로 변환
        String str = Integer.toString(n, 3);

        // 변환된 문자열 뒤집기
        String reversed = new StringBuilder(str).reverse().toString();

        // 뒤집은 문자열을 정수로 반환
        answer = Integer.parseInt(reversed, 3);

        return answer;
    }

    public static void main(String[] args)
    {
        삼진법_뒤집기 삼진법_뒤집기 = new 삼진법_뒤집기();
        int solution = 삼진법_뒤집기.solution(45);
        System.out.println("solution = " + solution);
    }
}
