import java.util.Random;
import java.util.Scanner;

public class example18_03_05_02 
{
	public static void main(String[] args) 
	{
		int numb;
		int summ = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do 
		{
			System.out.print("Enter the length of the array:"); 
			numb = scan.nextInt();	
		} while (numb<=0);
		
		Integer[] arr = new Integer[numb];
		ArrSuc02 array = new ArrSuc02();
		
		array.a_s(arr, numb, summ);
	}
}

class ArrSuc02
{
	public Integer[] a_s(Integer[] arr, int numb, int summ) 
	{
		
		Random random = new Random();
		
		int rand = random.nextInt(2, 100);
		int count = 0;
		
		for (;;) {
			if (count < numb)
			{
				rand = random.nextInt(2, 100);
				
				arr[count] = rand;
				summ += rand;
				count++;
			}else {	break;}
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
		}else {return a_s(arr, numb, 0);}
		return arr; 
	}
}