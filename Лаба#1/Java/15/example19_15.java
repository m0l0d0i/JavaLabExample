import java.util.Scanner;

public class example19_15 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = scanner.nextInt();

		scanner.close();

		int summ = firstNumber + secondNumber;
		System.out.printf("Amount: %d %n", firstNumber + secondNumber);
	}
}