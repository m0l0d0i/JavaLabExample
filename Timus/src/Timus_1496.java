/*
Задача #1496

Исходные данные:
В первой строке записано число N — количество сабмитов в последние 10 минут (0 ≤ N ≤ 100). 
Следующие N строк содержат названия команд, сабмитивших решения. Названия состоят только из строчных латинских букв и цифр. 
Длина названий не превосходит 30 символов.

Результат:
Выведите все аккаунты, под которыми, по мнению жюри, играет спамер. Порядок вывода не важен.
*/

import java.io.*;
import java.util.*;

public class Timus_1496 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(f.readLine());
		String[] stores = new String[n];

		for (int i = 0; i < n; i++) 
		{
			stores[i] = f.readLine();
		}

		Arrays.sort(stores);
		HashSet<String> duplicates = new HashSet<String>();

		for (int i = 1;  i< n; i++) 
		{
			if (stores[i].equals(stores[i-1]))
			{
					duplicates.add(stores[i]);
			}
					 
		}
		for (String s: duplicates)
		{
			System.out.println(s);
		}

		f.close();
		System.exit(0);
	}
}