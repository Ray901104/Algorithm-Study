package programmers.level1;

public class 카드_뭉치
{
    public String solution(String[] cards1, String[] cards2, String[] goal)
    {
        int i = 0;
        int j = 0;
        int k = 0;

        while (k < goal.length)
        {
            if (i < cards1.length && goal[k].equals(cards1[i]))
            {
                k++;
                i++;
            } else if (j < cards2.length && goal[k].equals(cards2[j]))
            {
                k++;
                j++;
            }
            else
            {
                break;
            }
        }

        return k == goal.length ? "Yes" : "No";
    }

    public static void main(String[] args)
    {
        카드_뭉치 카드_뭉치 = new 카드_뭉치();
        String solution = 카드_뭉치.solution(new String[]{"i", "drink", "water"}, new String[]{"want, to"}, new String[]{"i", "want", "to", "drink", "water"});
        System.out.println("solution = " + solution);
    }
}
