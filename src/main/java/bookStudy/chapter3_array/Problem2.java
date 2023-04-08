package bookStudy.chapter3_array;

public class Problem2
{
    private static final int[] dx = {0, 1, -1}; // 아래 오른쪽 왼쪽 위
    private static final int[] dy = {1, 0, -1}; // 아래 오른쪽 왼쪽 위

    public int[] solution(int n)
    {
        int[] answer = {};

        // 1. n * n 2차원 배열 선언
        int[][] triangle = new int[n][n];

        // 2. 숫자를 채울 현재 위치를 (0, 0)으로 설정
        int x = 0;
        int y = 0;

        int v = 1;
        int d = 0;

        // 3. 방향에 따라 이동할 수 없을 때까지 반복하면서 숫자 채우기
        while(true)
        {
            triangle[y][x] = v++;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0)
            {
                // 더이상 진행 불가능할 경우 방향 전환
                d = (d + 1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];

                if(nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) break;
            }

            x = nx;
            y = ny;
        }

        // 4. 채워진 숫자를 차례대로 1차원 배열에 옮겨서 반환
        answer = new int[v - 1];
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                answer[index++] = triangle[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Problem2 problem2 = new Problem2();
        problem2.solution(4);
    }
}
