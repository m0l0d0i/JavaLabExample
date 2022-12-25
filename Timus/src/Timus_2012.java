/*
Задача #2012

Исходные данные:
В единственной строке записано целое число f — сколько задач хочет решить Гриша за первый час соревнования (1 ≤ f ≤ 11).

Результат:
Выведите «YES», если Грише в одиночку удастся решить все предложенные задачи, и «NO» в противном случае.
*/

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus_2012 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int time = 45;
        int totalTime = 240;

        if (a>= 1 && a <= 11)
        {
            int oneTime = 12 - a;
            int remainingTime = time * oneTime;
            if (remainingTime <= totalTime)
            {
                out.println("YES");
            }else 
            {
                out.println("NO");
            }
        }
        out.flush();
    }
}