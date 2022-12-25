/*
Задача #1264

Исходные данные:
Единственная строка содержит целые числа N (0 ≤ N ≤ 40000) и M (0 ≤ M ≤ 40000).

Результат:
Выведите число секунд, требуемых Петечкину на написание функции.
*/

import java.util.*;

public class Timus_1264 
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        int N = in.nextInt();
        int M = in.nextInt() + 1;

        int count = M * N;

        System.out.print(count);

    }
}