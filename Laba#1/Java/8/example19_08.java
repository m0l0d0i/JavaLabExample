import java.util.Scanner;

public class example19_08
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input LastName: ");
		String LastName = in.nextLine();
		
		System.out.print("Input Name: ");
		String Name = in.nextLine();

		System.out.print("Input Surname: ");
		String Surname = in.nextLine();
		
		System.out.printf("LastName: %s, Name: %s, Surname: %s \n", LastName, Name, Surname);
		in.close();
	}
}