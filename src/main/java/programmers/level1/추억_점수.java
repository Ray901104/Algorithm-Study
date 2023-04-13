package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억_점수
{
    public int[] solution(String[] name, int[] yearning, String[][] photo)
    {
        int[] answer = new int[photo.length];

        // 인물별 그리움점수를 HashMap에 저장, 시간복잡도 O(N)
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++)
            map.put(name[i], yearning[i]);

        // photo를 순회하면서 그리움점수를 합산, 시간복잡도 O(N²)
        int sum;
        for (int i = 0; i < photo.length; i++)
        {
            sum = 0;
            for (int j = 0; j < photo[i].length; j++)
            {
                // photo의 원소가 name에 없을 경우 스킵
                if(!map.containsKey(photo[i][j]))
                    continue;

                // 그리움점수 합산
                sum += map.get(photo[i][j]);
            }
            answer[i] = sum;
        }

        return answer;
    }

    public static void main(String[] args)
    {
        추억_점수 추억_점수 = new 추억_점수();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] solution = 추억_점수.solution(name, yearning, photo);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
