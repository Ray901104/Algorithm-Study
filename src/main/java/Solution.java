public class Solution
{
    public String solution(String[] score)
    {
        String answer = "";

        // 모든 선수의 총점 계산
        double sum = 0;
        for (String s : score)
        {
            sum += Double.parseDouble(s);
        }
        // 평균값 계산
        double avg = sum / score.length;

        // 소수점 넷 째자리까지 버림하여 표기
        answer = String.valueOf((int) Math.floor(avg / 0.0001));
        System.out.println("answer = " + answer);
        String temp1 = answer.substring(0, 2);
        String temp2 = answer.substring(2);
        temp1 = temp1.concat(".");
        answer = temp1.concat(temp2);
        return answer;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        solution.solution(new String[]{"83.12", "25.44", "56.39", "12.67"});
    }
}
