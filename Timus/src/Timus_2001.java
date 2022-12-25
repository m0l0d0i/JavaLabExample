/*
Задача #2001

Исходные данные:
Входные данные состоят из трёх строк. В i-й строке (1 ≤ i ≤ 3) записаны целые числа ai и bi
(0 ≤ ai, bi ≤ 10 000).

Результат:
В единственной строке выведите пару целых чисел через пробел — массу ягод, собранных, соответственно,
первым и вторым математиком.
*/

import java.util.*;

public class Timus_2001 
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int[][] resault = new int[3][2];

        for (int i = 0; i <= resault.length-1; i++)
        {
            for (int j =0; j <= resault[i].length-1; j++)
            {
                resault[i][j]= in.nextInt();
            }
        }
        
        int res = resault[0][0] - resault[2][0];
        int res_2 = resault[0][1] - resault[1][1];
        System.out.println(res);
        System.out.println(res_2);
    }
}