/*
Задача #1639

Исходные данные:
В единственной строке через пробел записаны целые числа m и n (1 ≤ m, n ≤ 50) — длина и ширина
шоколадки в дольках.

Результат:
Если для того, чтобы выиграть, Карлсону нужно ходить первым,
выведите в единственной строке «[:=[first]», иначе выведите «[second]=:]».
*/

import java.io.*;
import java.util.*;

public class Timus_1639 
{
    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) 
    {
        int m = in.nextInt();
        int n = in.nextInt();

        int resault = m * n-1;

        if ((resault & 1) > 0)
        {
            out.println("[:=[first]");
        }else 
        {
            out.println("[second]=:]");
        }
        out.flush();
    }
}