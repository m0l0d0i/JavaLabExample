import java.util.Scanner;

public class example18_03_02
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the day of the week:"); 
		String dayOfWeek = scan.nextLine(); 
		
		switch (dayOfWeek.toLowerCase())
		{
			case("monday"):
				System.out.printf("%s is the 1st day of the week", dayOfWeek);
				break;
				
			case("tuesday"):
				System.out.printf("%s is the 2nd day of the week", dayOfWeek);
				break;
				
			case("wednesday"):
				System.out.printf("%s is the 3rd day of the week", dayOfWeek);
				break;
				
			case("thursday"):
				System.out.printf("%s is the 4th day of the week", dayOfWeek);
				break;
				
			case("friday"):
				System.out.printf("%s is the 5th day of the week", dayOfWeek);
				break;
				
			case("saturday"):
				System.out.printf("%s is the 6th day of the week", dayOfWeek);
				break;
				
			case("sunday"):
				System.out.printf("%s is the 7th day of the week", dayOfWeek);
				break;
				
			default:
				System.out.println("There is no such day of the week!");
		}
	}
}