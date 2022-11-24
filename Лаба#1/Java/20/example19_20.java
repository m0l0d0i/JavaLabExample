import java.util.Scanner;


public class example19_20
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double firstNumber = scanner.nextInt();

		System.out.print("Enter the second number: ");
		double secondNumber = scanner.nextInt();

		scanner.close();

		double equel = Math.pow(firstNumber, secondNumber);

		System.out.printf("%.1f raised to the power of %.1f %n", firstNumber, equel);
	}
}