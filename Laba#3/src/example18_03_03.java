import java.util.Scanner;

public class example18_03_03
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:"); 
		int numb = scan.nextInt(); 
		
		int[] arr = new int[numb];
		
		switch(numb)
		{
			case(0):
				System.out.println("Enter a number greater than!");
				break;
				
			case(1):
				arr[0] = 1;
				break;
				
			default:
				arr[0] = 1;
				arr[1] = 1;
				
				for (int i = 2; i < arr.length; ++i) 
				{
					arr[i] = arr[i - 1] + arr[i - 2];
				}
		}
			
		for (int i = 0; i < arr.length; ++i) 
		{
			  System.out.print(arr[i]+" ");
		}
	}
}