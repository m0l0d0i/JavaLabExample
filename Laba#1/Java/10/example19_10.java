import java.util.Scanner;

public class example19_10 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the current day of the week: ");
		String Day_Of_Week = scanner.nextLine();
		
		System.out.print("Enter the name of the month: ");
		String Name_Of_Month = scanner.nextLine();
		
		System.out.print("Input date of day: ");
		int Date_Of_Day = scanner.nextInt();
		scanner.close();
		
		System.out.printf("Today is %s, %d %s", Day_Of_Week, Date_Of_Day, Name_Of_Month);
	}
}