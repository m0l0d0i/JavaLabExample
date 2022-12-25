/*
Задача # 1753

Исходные данные:
Единственная строка содержит целые числа h, H и L (1 ≤ h < H < L ≤ 1000).

Результат:
Выведите с точностью не менее 10−5 величину максимального смещения влево положения центра книги относительно левого края полки.
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Timus_1753 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int H = sc.nextInt();
        int L = sc.nextInt();

        double x   = sqrt(pow(h, 4.0/3.0) * pow(H, 2.0/3.0)/pow(2, 2.0/3.0) - pow(h, 2.0));
        double res = H/2.0*1/sqrt(1 + pow(h/x, 2.0)) - x;

        if (res <= L && res > 0)
        {
            System.out.format("%.6f", res);
        }
        else
        {
            System.out.format("%.6f", 0.0);
        }
    }
}