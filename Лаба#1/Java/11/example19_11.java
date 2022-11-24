import java.util.Scanner;

public class example19_11 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		String[] list_Of_Month = {"january", "february", "march", "april", "may", "june", "july", 
								  "august", "september", "october", "november", "december"};
		
		System.out.print("Input name of month: ");
		String name_Of_Month = scanner.nextLine().toLowerCase();
		
		while(!name_Of_Month.isEmpty()) 
		{
			System.out.print("Input days in month: ");
			int total_Day_In_Month = scanner.nextInt();
			
			int daysInCurrentMonth = java.time.LocalDate.now().lengthOfMonth();

			if (total_Day_In_Month == daysInCurrentMonth) 
			{
				System.out.print("Success\n");
				break;
			}
			else 
			{
				System.out.printf("Fail! %d days in %s!\n", daysInCurrentMonth, name_Of_Month);
				continue;
			}
		}	
	}	
}