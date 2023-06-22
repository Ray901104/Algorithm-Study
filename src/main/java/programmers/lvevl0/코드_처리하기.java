package programmers.lvevl0;

public class 코드_처리하기
{
    public String solution(String code)
    {
        String[] codes = code.split("");
        StringBuilder sb = new StringBuilder();
        boolean mode = false; // false - 0, true - 1

        for (int i = 0; i < codes.length; i++)
        {
            if(codes[i].equals("1"))
            {
                mode = !mode;
            }
            else
            {
                if (!mode && (i % 2 == 0))
                {
                    sb.append(codes[i]);
                }
                else if(mode && (i % 2 != 0))
                {
                    sb.append(codes[i]);
                }
            }
        }

        if(sb.toString().isEmpty())
            return "EMPTY";

        return sb.toString();
    }

    public static void main(String[] args)
    {
        코드_처리하기 코드_처리하기 = new 코드_처리하기();
        String solution = 코드_처리하기.solution("abc1abc1abc");
        System.out.println("solution = " + solution);
    }
}
