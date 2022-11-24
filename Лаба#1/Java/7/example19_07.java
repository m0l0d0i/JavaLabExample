import java.util.Scanner;

public class example19_07 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Raduis kruga: ");
		int radius = in.nextInt();
		long area = Math.round(Math.PI * Math.pow(radius, 2));
		in.close();
		
		System.out.printf("S kruga s R %d = %d \n", radius, area);
	}
}