package programmers.level1;

public class 숫자_문자열과_영단어
{
    // 각 인덱스 값에 해당하는 영단어가 저장되어 있는 영단어 문자열 배열을 구성
    private static final String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public int solution(String s)
    {
        int answer = 0;

        for (int i = 0; i < words.length; i++)
        {
            // words를 순회하며 모든 s의 문자들을 변환
            s = s.replace(words[i], Integer.toString(i));
        }
        // 정수형으로 변환하여 리턴
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args)
    {
        숫자_문자열과_영단어 숫자_문자열과_영단어 = new 숫자_문자열과_영단어();
        int solution = 숫자_문자열과_영단어.solution("one4seveneight");
        System.out.println("solution = " + solution);
    }
}
