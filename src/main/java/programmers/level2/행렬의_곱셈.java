package programmers.level2;

import java.util.Arrays;

public class 행렬의_곱셈
{
    public int[][] solution(int[][] arr1, int[][] arr2)
    {
        int[][] answer = {};

        // 행렬의 곱셈 이해하기
        /**
         * [1 2 3]      [7 10]
         * [4 5 6]  *   [8 11]
         *              [9 12]
         * = [1*7 + 2*8 + 3*9   1*10 + 2*11 + 3*12]
         *   [4*7 + 5*8 + 6*9   4*10 + 5*11 + 6*12]
         *
         * = [50     68]
         *   [122   167]
         */

        // 결과값을 담을 행렬 배열 선언
        int[][] arr = new int[arr1.length][arr2[0].length];

        // 행렬 곱셈 구현
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                // arr[i][j] 값 구하기
                arr[i][j] = 0;
                for (int k = 0; k < arr1[i].length; k++)
                {
                    arr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        answer = arr;
        return answer;
    }

    public static void main(String[] args)
    {
        행렬의_곱셈 행렬의곱셈 = new 행렬의_곱셈();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        System.out.println("result = " + Arrays.deepToString(행렬의곱셈.solution(arr1, arr2)));
    }
}
