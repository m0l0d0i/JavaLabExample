/*
Задача #1820
Исходные данные:
В единственной строке через пробел записаны целые числа n и k (1 ≤ n, k ≤ 1000).

Результат:
Выведите минимальное количество минут, за которое повар сможет приготовить n бифштексов.
*/

import java.io.*;
import java.util.*;

public class Timus_1820 
{  
    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    static int calcTime(final int time, int n, int k) 
    {
        if (n <= 0) 
        {
            return 0;
        } else if (n < k) 
        {
            return 2 * time;
        } else 
        {
            int appender = 0;
            int n2 = n << 1;
            if (((n2 % k)) > 0) 
            {
                appender = 1;
            }
            return n2 / k + appender;
        }
    }

    public static void main(String str[]) 
    {
        int n = input.nextInt();
        int k = input.nextInt();

        final int time = 1;


        out.println(calcTime(time, n, k));
        out.flush();
    }
}