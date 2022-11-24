import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class example18_03_09 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of the array:"); 
		int numb = scan.nextInt(); 
				
		MainFunc mainMin = new MainFunc();
		mainMin.weightMassive(numb);
	}
}

class MainFunc
{
	public Integer[] weightMassive(int numb)
	{
		Integer[] arr = new Integer[numb];
		Random random = new Random();

		System.out.print("Array: ");
		
		for (int i=0;i<numb;i++) 
		{
			arr[i] = random.nextInt(100);
			
			System.out.print(arr[i] + " ");
	      
		}
		return minValues(arr);
	}
	
	public Integer[] minValues (Integer[] arr)
	{
		int min = arr[0] + 1;
		for(int i = 0; i < arr.length; i++) 
		{
		    if (arr[i]< min) 
		    {
		       min = arr[i]; 
		    } 
		}
		return searchMinValues(arr, min);
		
	}
	
	public Integer[] searchMinValues (Integer[] arr, int min)
	{
		System.out.println("\n" + "Minimum value: " + min);
		for(int i = 0; i < arr.length; i++) 
		{
		    if (arr[i] == min) 
		    {
		    	System.out.println("Index: " + i); 
		    } 
		}
		return arr;
	}
}