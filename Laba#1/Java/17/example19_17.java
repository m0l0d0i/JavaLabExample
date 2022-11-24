import java.util.Scanner;

public class example19_17
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = scanner.nextInt();

		scanner.close();

		int Amount = firstNumber + secondNumber;
		int Difference = firstNumber + secondNumber;
		System.out.printf("Amount: %d %n", firstNumber + secondNumber);
		System.out.printf("Difference: %d %n", firstNumber - secondNumber);
	}
}