import java.util.Random;
import java.util.Scanner;

public class example18_03_06 
{
	public static void main(String[] args) 
	{
		int numb;
		int count = 0;

		Scanner scan = new Scanner(System.in);
		
		do 
		{
			System.out.print("Enter the length of the array:"); 
			numb = scan.nextInt();	
		} while (numb<=0);
		
		 
		Integer[] arr = new Integer[numb];;
		Random random = new Random();
		while (count < numb)
		{
			int rand = random.nextInt(2, 100);
			
			if(rand % 5 == 2)
			{
				arr[count] = rand;
				count++;
			} else {rand = random.nextInt(2, 100);}
		}
		
        for (Integer intArr : arr) 
        {
            System.out.print(intArr + " ");
        }  
	}

}
