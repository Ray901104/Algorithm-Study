package programmers.level2;

import java.util.Arrays;

public class 쿼드압축_후_개수_세기
{
    public int[] solution(int[][] arr)
    {
        Count count = count(0, 0, arr.length, arr);
        return new int[]{count.zero, count.one};
    }

    private static class Count
    {
        public final int zero;
        public final int one;

        public Count(int zero, int one)
        {
            this.zero = zero;
            this.one = one;
        }

        public Count add(Count other)
        {
            return new Count(zero + other.zero, one + other.one);
        }
    }

    private Count count(int offsetX, int offsetY, int size, int[][] arr)
    {
        int h = size / 2;
        for (int x = offsetX; x < offsetX + size; x++)
        {
            for (int y = offsetY; y < offsetY + size; y++)
            {
                if (arr[y][x] != arr[offsetY][offsetX])
                {
                    return count(offsetX, offsetY, h, arr)
                            .add(count(offsetX + h, offsetY, h, arr))
                            .add(count(offsetX, offsetY + h, h, arr))
                            .add(count(offsetX + h, offsetY + h, h, arr));
                }
            }
        }
        if (arr[offsetY][offsetX] == 1)
        {
            return new Count(0, 1);
        }
        return new Count(1, 0);
    }

    public static void main(String[] args)
    {
        쿼드압축_후_개수_세기 쿼드압축_후_개수_세기 = new 쿼드압축_후_개수_세기();
        int[][] arr = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        int[] solution = 쿼드압축_후_개수_세기.solution(arr);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
