import java.util.Scanner;

public class example19_2_02 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int in_number = scanner.nextInt();
		scanner.close();
		
			if (in_number % 5 == 2 && in_number % 7 == 1) 
			{
				System.out.printf("The number %d fits the criteria \n", in_number);
			}else 
			{
				System.out.printf("The number %d dont fits the criteria \n", in_number);
			}
	}
}