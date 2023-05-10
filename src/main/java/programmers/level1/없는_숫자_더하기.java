package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 없는_숫자_더하기
{
    private static final int[] NUMBERS = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public int solution(int[] numbers)
    {
        List<Integer> numList = new ArrayList<>();
        for (int number : numbers)
            numList.add(number);

        int sum = 0;
        for (int number : NUMBERS)
        {
            if(!numList.contains(number)) sum += number;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        없는_숫자_더하기 없는_숫자_더하기 = new 없는_숫자_더하기();
        int solution = 없는_숫자_더하기.solution(new int[]{5, 8, 4, 0, 6, 7, 9});
        System.out.println("solution = " + solution);
    }
}
