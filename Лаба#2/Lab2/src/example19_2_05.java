import java.util.Scanner;

public class example19_2_05
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int in_number = scanner.nextInt();
		scanner.close();
        int finalResult = (in_number - (in_number%1000))/1000;
        int fourInt = (in_number /1000)%10;
        System.out.printf("%d so many 1000 in the number %d \nThe fourth number on the right %d", 
        				  finalResult, in_number, fourInt);
	}
}