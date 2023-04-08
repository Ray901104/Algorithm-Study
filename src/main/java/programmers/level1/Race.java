package programmers.level1;

import java.util.Arrays;

public class Race
{
    public String[] solution(String[] players, String[] callings)
    {
        String[] answer = {};

        for (int i = 0; i < callings.length; i++)
        {
            // 호출된 선수의 위치를 앞 선수와 바꾸기
            String tmp = "";
            int fastPlayerIdx = Arrays.asList(players).indexOf(callings[i]); // 추월한 선수의 위치
            int caughtPlayerIdx =  fastPlayerIdx - 1; // 추월 당한 선수의 위치
            String fastPlayer = players[fastPlayerIdx]; // 추월한 선수
            String caughtPlayer = players[caughtPlayerIdx]; // 추월 당한 선수

            // players 배열에 바뀐 순위로 정렬
            players[caughtPlayerIdx] = fastPlayer;
            players[fastPlayerIdx] = caughtPlayer;
        }
        answer = players;
        return answer;
    }

    public static void main(String[] args)
    {
        Race race = new Race();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] result = race.solution(players, callings);

        System.out.println("result = " + Arrays.toString(result));
    }
}
