package levelTwo;

import java.util.*;
import java.util.function.Predicate;

class Solution
{
    public int solution(int[] picks, String[] minerals)
    {
        Queue<String> mineralOrder = new LinkedList<>();
        for (String mineral : minerals)
        {
            mineralOrder.offer(mineral);
        }

        Queue<Info> mining = new LinkedList<>();
        mining.offer(new Info(picks, mineralOrder, 0));

        return bfs(mining);
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 3, 2}, new String[]{"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"});
        System.out.println("result = " + result);
    }

    private int bfs(Queue<Info> mining)
    {
        int min = Integer.MAX_VALUE;

        while (!mining.isEmpty()) {
            Info cn = mining.poll();
            boolean allUsed = isAllPickUsed(cn);

            // 4. 모든 광물 캐거나, 사용할 곡괭이가 없으면 해당 탐색을 종료한다. (최소 피로도를 갱신한다.)
            if (cn.minerals.isEmpty() || allUsed)
            {
                min = Math.min(min, cn.fatigue);
                continue;
            }

            // 1. bfs로 곡괭이를 선택하는 모든 경우의 수를 구한다.
            for (int i = 0; i < 3; i++)
            {
                if (cn.picks[i] == 0) continue;

                int[] copiedPick = copyPick(cn.picks);
                Queue<String> copiedMineral = copyMinerals(cn.minerals);

                // 2. 선택된 곡괭이로 광물을 앞에서 부터 5개 캔다. (피로도를 누적한다.)
                int cnt = 0;
                int sumFatigue = 0;
                while (!copiedMineral.isEmpty() && cnt++ < 5)
                {
                    sumFatigue += Mining.calFatigue(i, copiedMineral.poll());
                }

                // 3. 사용된 곡괭이의 개수를 줄인다.
                copiedPick[i]--;

                mining.add(new Info(copiedPick, copiedMineral, cn.fatigue + sumFatigue));
            }
        }

        return min;
    }

    private boolean isAllPickUsed(Info cn)
    {
        for (int i = 0; i < 3; i++)
        {
            if (cn.picks[i] != 0)
            {
                return false;
            }
        }
        return true;
    }

    private int[] copyPick(int[] picks) {
        return Arrays.copyOf(picks, 3);
    }

    private Queue<String> copyMinerals(Queue<String> minerals) {
        return new LinkedList<>(minerals);
    }

    private static class Info
    {
        int[] picks; // 곡괭이
        Queue<String> minerals; // 광물
        int fatigue; // 피로도

        public Info(int[] picks, Queue<String> minerals, int fatigue)
        {
            this.picks = picks;
            this.minerals = minerals;
            this.fatigue = fatigue;
        }
    }

    private enum Mining
    {
        DIAMOND(0, x -> x.equals("diamond")),
        IRON(1, x -> x.equals("iron")),
        STONE(2, x -> x.equals("stone"));

        private int pick;
        private Predicate<String> predicate;

        Mining(int pick, Predicate<String> predicate)
        {
            this.pick = pick;
            this.predicate = predicate;
        }

        private boolean test(String mine){
            return this.predicate.test(mine);
        }

        private static Mining adequatePick(String mine)
        {
            return Arrays.stream(Mining.values())
                    .filter(e -> e.test(mine))
                    .findAny()
                    .orElseThrow();
        }

        private static int calFatigue(int pi, String mine)
        {
            Mining adequate = adequatePick(mine);

            if (pi <= adequate.pick)
            {
                return 1;
            }
            return (int) Math.pow(5, (pi - adequate.pick));
        }
    }
}