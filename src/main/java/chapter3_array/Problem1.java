package chapter3_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1
{
    public String[] solution(int[][] line)
    {
        String[] answer = {};
        List<Point> points = new ArrayList<>();

        // 1. 모든 직선 쌍에 대해 반복
        for (int i = 0; i < line.length; i++)
        {
            for (int j = i + 1; j < line.length; j++)
            {
                // line[i], line[j]를 이용하여 1-A, 1-B 수행
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                                                  line[j][0], line[j][1], line[j][2]);
                if(intersection != null)
                {
                    points.add(intersection);
                }
            }
        }

        // 3. 구한 최댓값, 최솟값을 이용하여 2차원 배열의 크기 결정
        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);

        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        // 위에서 구한 크기의 배열을 선언하고, 모든 좌표를 . 으로 채움
        char[][] arr = new char[height][width];
        for (char[] row : arr)
        {
            Arrays.fill(row, '.');
        }

        // 4. 2차원 배열에 별 표시
        for (Point p : points)
        {
            // 일반 좌표를 2차원 배열 좌표로 변환
            int x = (int) (p.x - minimum.x);
            int y = (int) (maximum.y - p.y);
            arr[y][x] = '*';
        }

        // 5. 문자열 배열로 변환 후 반환
        answer = new String[arr.length];
        for (int i = 0; i < answer.length; i++)
        {
            answer[i] = new String(arr[i]);
        }

        return answer;
    }

    // 2. 저장된 정수들에 대해 x, y 좌표의 최댓값, 최솟값 구하기
    // 가장 큰 좌표 찾기
    private Point getMaximumPoint(List<Point> points)
    {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points)
        {
            if(p.x > x) x = p.x;
            if(p.y > y) y = p.y;
        }

        return new Point(x, y);
    }

    // 가장 작은 좌표 찾기
    private Point getMinimumPoint(List<Point> points)
    {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points)
        {
            if(p.x < x) x = p.x;
            if(p.y < y) y = p.y;
        }

        return new Point(x, y);
    }


    // 1-A. 교점 좌표 구하기
    // a1x + b1y + c1 = 0
    // a2x + b2y + c2 = 0
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2)
    {
        // 교점 구해서 반환하기
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        // 좌표가 정수인지 체크
        if(x % 1 != 0 || y % 1 != 0) return null;

        return new Point((long) x, (long) y);
    }

    // 0. 좌표를 나타내는 클래스 작성
    private static class Point
    {
        public final long x, y;
        private Point(long x, long y)
        {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args)
    {
        Problem1 problem1 = new Problem1();
        System.out.println("result = " + Arrays.toString(problem1.solution(new int[][]{{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}})));
    }
}

