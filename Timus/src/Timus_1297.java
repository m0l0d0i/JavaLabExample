/*
Задача #1297

Исходные данные:
Содержит всего одну строчку (не длиннее 1000 символов), содержащую только буквы латинского алфавита 
(все пробелы и знаки препинания из строки Вася уже удалил).

Результат:
Максимальная по длине подстрока, читающаяся одинаково в обоих направлениях. 
Если максимальных по длине подстрок больше одной, вывести самую левую из них.
*/

import java.util.Scanner;

public class Timus_1297 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        String  S = sc.nextLine();
        int     N = S.length();
        int[][] T = new int[N][N];

        int st  = 0;
        int end = 0;
        int max = 0;
        for (int k = 0; k < N; k++) 
        {
            for (int h = k; h < N; h++) 
            {
                int i = h - k;
                int j = h;
                if (i == j) {
                    T[i][j] = 1;
                } else if (S.charAt(i) == S.charAt(j)) 
                {
                    if (i + 1 == j) 
                    {
                        T[i][j] = 1;
                    } else{
                        T[i][j] = T[i + 1][j - 1];
                    }

                    if (j - i > max && T[i][j] == 1) 
                    {
                        max = j - i;
                        st  = i;
                        end = j;
                    }
                } else 
                {
                    T[i][j] = 0;
                }
            }
        }
        System.out.println(S.substring(st, end + 1));
    }
}