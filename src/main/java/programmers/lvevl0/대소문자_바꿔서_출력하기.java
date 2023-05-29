package programmers.lvevl0;

import java.util.Scanner;

public class 대소문자_바꿔서_출력하기
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] cArr = a.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cArr.length; i++)
        {
            if (Character.isLowerCase(cArr[i]))
            {
                cArr[i] = Character.toUpperCase(cArr[i]);
            }
            else
            {
                cArr[i] = Character.toLowerCase(cArr[i]);
            }
            sb.append(cArr[i]);
        }

        System.out.println(sb);
    }
}
