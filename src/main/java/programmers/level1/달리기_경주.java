package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기_경주
{
    public String[] solution(String[] players, String[] callings)
    {
        String firstPlayer = players[0]; // 1위 선수
        Map<String, Integer> playersMap = new HashMap<>();

        // players Map으로 옮기기
        for (int i = 0; i < players.length; i++)
            playersMap.put(players[i], i);

        for (String calling : callings)
        {
            // 호출리스트의 선수가 현재 1위인 경우 스킵
            if (calling.equals(firstPlayer))
                continue;

            // 1. 호출된 선수의 위치를 Map으로부터 받아오기
            int fastPlayerIdx = playersMap.get(calling); // 추월한 선수의 위치
            int caughtPlayerIdx = fastPlayerIdx - 1; // 추월 당한 선수의 위치
            String fastPlayer = players[fastPlayerIdx]; // 추월한 선수
            String caughtPlayer = players[caughtPlayerIdx]; // 추월 당한 선수

            // 2. players 배열에 바뀐 순위로 정렬
            players[caughtPlayerIdx] = fastPlayer; // 추월한 선수
            players[fastPlayerIdx] = caughtPlayer; // 추월 당한 선수

            // 3. 변경된 위치값을 Map에도 갱신
            playersMap.put(fastPlayer, caughtPlayerIdx);
            playersMap.put(caughtPlayer, fastPlayerIdx);
            
            // 4. 위치가 바뀐 이후의 1위 선수 갱신
            firstPlayer = players[0];
        }
        return players;
    }

    public static void main(String[] args)
    {
        달리기_경주 달리기경주 = new 달리기_경주();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] result = 달리기경주.solution(players, callings);

        System.out.println("result = " + Arrays.toString(result));
    }
}
