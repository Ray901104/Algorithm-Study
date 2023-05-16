package programmers.level1;

public class 나머지가_1이_되는_수_찾기
{
    public int solution(int n)
    {
        int answer = 0;
        for (int i = 2; i < n; i++)
        {
            if (n % i == 1)
            {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        나머지가_1이_되는_수_찾기 나머지가_1이_되는_수_찾기 = new 나머지가_1이_되는_수_찾기();
        int solution = 나머지가_1이_되는_수_찾기.solution(3);
        System.out.println("solution = " + solution);
    }
}
