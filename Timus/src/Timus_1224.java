/*
Задача #1224

Исходные данные:
Ввод состоит из двух целых чисел в следующем порядке: N, M (1 ≤ N, M ≤ 231 − 1).

Результат:
Вывод состоит из одного целого числа — количества поворотов.
*/

import java.util.Scanner;

public class Timus_1224 
{        
    public static long turns(long N, long M) 
    {
        if (N <= M) 
        {
            return  4*(N/2) - 2*((N + 1) % 2);
        } 

        return 4*(M/2) - 2*((M + 1) % 2) + 1;   
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        System.out.println(turns(N, M)); 
    }
}