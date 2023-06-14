package programmers.lvevl0;

public class 더_크게_합치기
{
    public int solution(int a, int b)
    {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        int num1 = Integer.parseInt(str1 + str2);
        int num2 = Integer.parseInt(str2 + str1);

        return Math.max(num1, num2);
    }

    public static void main(String[] args)
    {
        더_크게_합치기 더_크게_합치기 = new 더_크게_합치기();
        int solution = 더_크게_합치기.solution(9, 91);
        System.out.println("solution = " + solution);
    }
}
