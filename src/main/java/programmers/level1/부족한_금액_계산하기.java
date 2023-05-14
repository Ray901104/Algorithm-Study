package programmers.level1;

public class 부족한_금액_계산하기
{
    public long solution(int price, int money, int count)
    {
        long answer = -1;
        long totalPrice = 0;
        for (int i = 1; i <= count; i++)
        {
            totalPrice += (long) price * i;
            if (money < totalPrice)
            {
                answer = totalPrice - money;
            }
            else
            {
                answer = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        부족한_금액_계산하기 부족한_금액_계산하기 = new 부족한_금액_계산하기();
        long solution = 부족한_금액_계산하기.solution(3, 20, 4);
        System.out.println("solution = " + solution);
    }
}
