/*
Задача #1197

Исходные данные:
В первой строке находится единственное число N, 1 ≤ N ≤ 64 — количество тестов.
В каждой из последующих N строк содержится очередной тест: два символа
(маленькая латинская буква от 'a' до 'h' и цифра от 1 до 8) — стандартное шахматное
обозначение клетки, на которой стоит конь. При этом буква обозначает вертикаль,
а цифра — горизонталь.

Результат:
Выведите N строк: в каждой из них должно находиться единственное число — количество клеток
шахматной доски, находящихся под боем коня
*/

import java.io.*;
import java.util.*;

public class Timus_1197 
{
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException 
    {
        final int size = 8;
        int dx[] = {-2, -2, 2, 2, -1, 1, -1, 1};
        int dy[] = {1, -1, 1, -1, 2, 2, -2, -2};

        int n = Integer.parseInt(buffer.readLine());
        List<String> tests = new ArrayList<String>(n);
        for (int i = 0; i < n; i++) 
        {
            tests.add(buffer.readLine().toLowerCase());
        }

        for (String next : tests) 
        {
            int column = next.charAt(0) - 'a';
            int row = next.charAt(1) - '1';

            int positionCount = 0;
            int currentX = 0;
            int currentY = 0;
            for (int i = 0; i < size; i++) 
            {
                currentX = column + dx[i];
                currentY = row + dy[i];
                if (currentX >= 0 && currentX < size && currentY >= 0 && currentY < size) 
                {
                    positionCount++;
                }
            }
            out.println(positionCount);
        }
        out.flush();
    }
}