package programmers.level2;

import java.util.Arrays;

public class 카펫
{
    public int[] solution(int brown, int yellow)
    {
        int[] answer = {};

        for (int width = 3; width <= 5000; width++)
        {
            for (int height = 3; height <= width; height++)
            {
                int boundary = (width + height - 2) * 2;
                int center = width * height - boundary;

                if (brown == boundary && yellow == center)
                {
                    return new int[]{width, height};
                }
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        카펫 카펫 = new 카펫();
        int[] solution = 카펫.solution(24, 24);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}