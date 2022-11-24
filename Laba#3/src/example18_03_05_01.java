import java.util.Random;
import java.util.Scanner;

public class example18_03_05_01 
{
	public static void main(String[] args) 
	{
		int numb;
		int count = 0;
		int summ = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do 
		{
			System.out.print("Enter the length of the array:"); 
			numb = scan.nextInt();	
		} while (numb<=0);
		
		Integer[] arr = new Integer[numb];
		ArrSuc01 array = new ArrSuc01();
		
		array.a_s(arr, count, numb, summ);
	}
}

class ArrSuc01
{
	public Integer[] a_s(Integer[] arr, int count, int numb, int summ) 
	{
		
		Random random = new Random();
		
		int rand = random.nextInt(2, 100);
		
		while (count < numb)
		{
			rand = random.nextInt(2, 100);
			
			arr[count] = rand;
			summ += rand;
			count++;
		}
		return arrPrint(arr, summ, numb);
	}
	public Integer[] arrPrint(Integer[] arr, int summ, int numb) 
	{
		if (summ % 5 == 2 || summ % 3 == 1) 
		{
			for (Integer intArr : arr) 
			{
	            System.out.print(intArr + " ");
	        }
			System.out.println("\n"+"Amount:"+summ);
		}else 
		{
			return a_s(arr, 0, numb, 0);
		}
		return arr; 
	}
}