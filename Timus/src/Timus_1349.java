/*
Задача #1349

Исходные данные:
n (0 ≤ n ≤ 100)

Результат:
Три различных целых числа (а, b, c) таких, что аn + bn = cn, 1 ≤ a, b, c ≤ 100. Если решений несколько, вывести то, где a минимально. 
Если и таких несколько, вывести то, где минимально b и т.д. Вывести −1, если решения нет.
*/

import java.util.Scanner;

public class Timus_1349 
{
	public static void main(String[] args) 
	{
		Scanner scann = new Scanner(System.in);
		
		int numb = scann.nextInt();

		for (int a = 1; a <= 98; a++) 
		{
			for (int b = a + 1; b <= 99 ; b++) 
			{
				for (int c = b + 1; c <= 100; c++) 
				{
					if(Math.pow(a, numb) + Math.pow(b, numb) == Math.pow(c, numb))
					{
						System.out.println(a + " "+ b +" "+ c);
						System.exit(0);
					}
				}
			}
		}
		System.out.println("-1");
	}
}