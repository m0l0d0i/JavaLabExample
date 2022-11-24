import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class example18_03_10 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of the array:"); 
		int numb = scan.nextInt(); 
		
		Integer[] arr = new Integer[numb];;
		Random random = new Random();
		
		for (int i=0;i<numb;i++) 
		{
			int rand = random.nextInt(200);
			while (rand % 2 != 0)
			{
				rand = random.nextInt(200);
			}
			arr[i] = rand;
		}
           
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
	}
}