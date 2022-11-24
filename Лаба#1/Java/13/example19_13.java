import java.util.Scanner;
import java.time.YearMonth;

public class example19_13 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String userName = scanner.nextLine();

		System.out.print("Enter the year of birth: ");
		int userWasBorn = scanner.nextInt();

		scanner.close();

		int year = YearMonth.now().getYear();

		int userAge = year - userWasBorn;
		System.out.printf("Your name: %s, age: %d %n", userName, userAge);
	}
}