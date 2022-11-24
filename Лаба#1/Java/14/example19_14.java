import java.util.Scanner;
import java.time.YearMonth;

public class example19_14 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int userWasBorn = scanner.nextInt();
		scanner.close();

		int year = YearMonth.now().getYear();

		int userAge = year - userWasBorn;
		System.out.printf("You were born this year: %d %n", userAge);
	}
}