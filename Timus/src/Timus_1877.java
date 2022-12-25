/*
Задача #1877

Исходные данные:
В первой строке записан код, установленный на первом замке, во второй строке — код, установленный на втором замке. 
Оба кода — строки длины 4, состоящие из цифр от 0 до 9.

Результат:
Выведите «yes», если злоумышленник рано или поздно взломает замок, и «no» в противном случае.
*/

import java.io.PrintWriter;
import java.util.*;

public class Timus_1877 
{
    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) 
    {
        String s1 = input.next();
        String s2 = input.next();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        if ((n1 & 1) == 0 || (n2 & 1) > 0) 
        {
            out.println("yes");
        } else 
        {
            out.println("no");
        }
        out.flush();
    }
}