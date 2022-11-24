import java.util.Scanner;

public class example19_16 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = scanner.nextInt();
		scanner.close();
		
		int OneNum = num - 1;
		int moreOneNum = num + 1;
		int sqrtNum = (OneNum + num + moreOneNum)*(OneNum + num + moreOneNum);

		System.out.printf("Result1: %d \n", OneNum);
		System.out.printf("Result2: %d \n", num);
		System.out.printf("Result3: %d \n", moreOneNum);
		System.out.printf("Result4: %d \n", sqrtNum);
	}
}